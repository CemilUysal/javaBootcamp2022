package HW3.dataAccess.concretes;

import HW3.dataAccess.abstracts.InstructorDao;
import HW3.entities.Instructor;

public class JDBCInstructorDao implements InstructorDao {
    @Override
    public void add(Instructor instructor) {
        System.out.println("Instructor added with JDBC : " + instructor.getFirstName() + " " + instructor.getLastName());
    }

    @Override
    public void update(Instructor instructor) {
        System.out.println("Instructor updated with JDBC : " + instructor.getFirstName() + " " + instructor.getLastName());
    }

    @Override
    public void delete(Instructor instructor) {
        System.out.println("Instructor deleted with JDBC : " + instructor.getFirstName() + " " + instructor.getLastName());
    }
}
