package HW3.business;

import HW3.core.logging.Logger;
import HW3.dataAccess.abstracts.CourseDao;
import HW3.entities.Course;

public class CourseManager {
    private Logger [] loggers;
    private CourseDao courseDao;

    public CourseManager( CourseDao courseDao, Logger[] loggers) {
        this.loggers = loggers;
        this.courseDao = courseDao;
    }
    public void add(Course course) throws Exception {
        isNameValid(course.getCourseName());
        isPriceValid(course.getPrice());
        courseDao.add(course);
        log(course);
    }
    public void update (Course course) throws Exception{
        isNameValid(course.getCourseName());
        isPriceValid(course.getPrice());
        courseDao.update(course);
        log(course);
    }
    public void delete(Course course){
        courseDao.delete(course);
        log(course);
    }
    private void log(Course course){
        for (Logger logger: loggers ){
            logger.log(course.getCourseName());
        }
    }
    private void isNameValid(String name) throws Exception {
        if(courseDao.findByName(name) != null){
            throw new Exception("This course name is already registered in the system. Cannot be re-registered");
        }
    }
    private void isPriceValid(Double price) throws Exception {
        if(price<0){
            throw new Exception("The course price cannot be a negative value");
        }
    }
}
