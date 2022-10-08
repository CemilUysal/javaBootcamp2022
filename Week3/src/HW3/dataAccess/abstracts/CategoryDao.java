package HW3.dataAccess.abstracts;

import HW3.entities.Category;

public interface CategoryDao {
    void add(Category category);
    void update(Category category);
    void delete(Category category);
    Category findByName(String categoryName);
}
