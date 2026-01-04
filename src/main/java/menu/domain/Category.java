package menu.domain;

import java.util.List;

public class Category {
    private final int categoryNum;
    private final String categoryName;
    private final List<String> menu;

    public Category(int categoryNum, String categoryName, List<String> menu){
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

    public List<String> getMenu(){
        return menu;
    }
}
