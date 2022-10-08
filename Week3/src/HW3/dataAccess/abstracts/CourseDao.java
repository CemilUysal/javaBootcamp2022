package HW3.dataAccess.abstracts;

import HW3.entities.Course;

public interface CourseDao {
    void add(Course course);
    void update(Course course);
    void delete(Course course);
    Course findByName(String categoryName);
}
