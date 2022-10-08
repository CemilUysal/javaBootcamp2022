package HW3.business;

import HW3.core.logging.Logger;
import HW3.dataAccess.abstracts.InstructorDao;
import HW3.entities.Instructor;

public class InstructorManager {
    private Logger [] loggers;
    private InstructorDao instructorDao;

    public InstructorManager(InstructorDao instructorDao, Logger[] loggers) {
        this.loggers = loggers;
        this.instructorDao = instructorDao;
    }
    public void add(Instructor instructor){
        instructorDao.add(instructor);
        log(instructor);
    }
    public void update (Instructor instructor){
        instructorDao.update(instructor);
        log(instructor);
    }
    public void delete(Instructor instructor){
        instructorDao.delete(instructor);
        log(instructor);
    }
    private void log(Instructor instructor){
        for (Logger logger: loggers ){
            logger.log(instructor.getFirstName() + " " + instructor.getLastName());
        }
    }
}
