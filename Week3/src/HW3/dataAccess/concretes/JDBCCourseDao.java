package HW3.dataAccess.concretes;

import HW3.dataAccess.abstracts.CourseDao;
import HW3.entities.Course;

public class JDBCCourseDao implements CourseDao {
    @Override
    public void add(Course course) {
        System.out.println("Course added with JDBC : " + course.getCourseName());
    }

    @Override
    public void update(Course course) {
        System.out.println("Course updated with JDBC : " + course.getCourseName());
    }

    @Override
    public void delete(Course course) {
        System.out.println("Course deleted with JDBC " + course.getCourseName());
    }

    @Override
    public Course findByName(String categoryName) {
        return null;
    }
}
