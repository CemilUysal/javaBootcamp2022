package HW3.business;

import HW3.core.logging.Logger;
import HW3.dataAccess.abstracts.CategoryDao;
import HW3.entities.Category;

public class CategoryManager {
    private CategoryDao categoryDao;
    private Logger [] loggers;

    public CategoryManager(CategoryDao categoryDao, Logger[] loggers) {
        this.categoryDao = categoryDao;
        this.loggers = loggers;
    }

    public void add(Category category) throws Exception {
        isNameValid(category.getCategoryName());
        categoryDao.add(category);
        log(category);
    }
    public void update (Category category) throws Exception{
        isNameValid(category.getCategoryName());
        categoryDao.update(category);
        log(category);
    }
    public void delete(Category category){
        categoryDao.delete(category);
        log(category);
    }
    private void log( Category category){
        for (Logger logger: loggers ){
            logger.log(category.getCategoryName());
        }
    }
    private void isNameValid(String name) throws Exception {
        if(categoryDao.findByName(name) != null){
            throw new Exception("This category name is already registered in the system. Cannot be re-registered");
        }
    }
}
