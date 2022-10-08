package HW3.dataAccess.abstracts;

import HW3.entities.Instructor;

public interface InstructorDao {
    void add(Instructor instructor);
    void update(Instructor instructor);
    void delete(Instructor instructor);
}
