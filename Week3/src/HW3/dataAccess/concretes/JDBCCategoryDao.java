package HW3.dataAccess.concretes;

import HW3.dataAccess.abstracts.CategoryDao;
import HW3.entities.Category;

public class JDBCCategoryDao implements CategoryDao {
    @Override
    public void add(Category category) {
        System.out.println("Category added with JDBC : " + category.getCategoryName());
    }

    @Override
    public void update(Category category) {
        System.out.println("Category updated with JDBC : " + category.getCategoryName());
    }

    @Override
    public void delete(Category category) {
        System.out.println("Category deleted with JDBC : " + category.getCategoryName());
    }

    @Override
    public Category findByName(String categoryName) {
        return null;
    }
}
