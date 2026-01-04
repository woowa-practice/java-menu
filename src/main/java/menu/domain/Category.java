package menu.domain;

import java.util.List;

public class Category {
    private final int categoryNum;
    private final String categoryName;
    private final List<Menu> menu;

    public Category(int categoryNum, String categoryName, List<Menu> menu){
        this.categoryNum=categoryNum;
        this.categoryName=categoryName;
        this.menu=menu;
    }

    public int getCategoryNum(){
        return categoryNum;
    }

    public String getCategoryName(){
        return categoryName;
    }

    public List<Menu> getMenu(){
        return menu;
    }
}
