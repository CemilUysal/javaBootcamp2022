package HW3;


import HW3.business.CategoryManager;
import HW3.business.CourseManager;
import HW3.business.InstructorManager;
import HW3.core.logging.DatabaseLogger;
import HW3.core.logging.FileLogger;
import HW3.core.logging.Logger;
import HW3.core.logging.MailLogger;
import HW3.dataAccess.concretes.HibernateCategoryDao;
import HW3.dataAccess.concretes.HibernateCourseDao;
import HW3.dataAccess.concretes.JDBCInstructorDao;
import HW3.entities.Category;
import HW3.entities.Course;
import HW3.entities.Instructor;

public class Main {
    public static void main(String[] args) throws Exception {
        Logger[] loggers = {new DatabaseLogger(), new FileLogger(), new MailLogger()};
        Instructor instructor = new Instructor(1,"Cemil","Uysal");
        InstructorManager instructorManager = new InstructorManager( new JDBCInstructorDao(), loggers);
        instructorManager.add(instructor);

        Category category = new Category(1,"Programlama");
        CategoryManager categoryManager = new CategoryManager(new HibernateCategoryDao(),loggers );
        categoryManager.add(category);

        Course course = new Course("Java",1000, category, instructor);
        CourseManager courseManager = new CourseManager(new HibernateCourseDao(),loggers );
        courseManager.add(course);
    }
}
