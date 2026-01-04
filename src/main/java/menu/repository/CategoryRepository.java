package menu.repository;

import menu.domain.Category;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CategoryRepository {
    private static final List<Category> categorys=new ArrayList<>();

    public static List<Category> getCategorys(){
        return Collections.unmodifiableList(categorys);
    }

    public static void addCategory(Category category){
        categorys.add(category);
    }
}
