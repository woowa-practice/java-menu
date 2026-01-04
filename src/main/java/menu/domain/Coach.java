package menu.domain;

import java.util.List;

public class Coach {
    private final String name;
    private String category;
    private final String menu;
    private final List<String> banMenu;

    public Coach(String name, String category, String menu, List<String> banMenu){
        this.name=name;
        this.category=category;
        this.menu=menu;
        this.banMenu=banMenu;
    }

    public String getName(){
        return name;
    }

    public String getCategory(){
        return category;
    }

    public String getMenu() {
        return menu;
    }

    public List<String> getBanMenu(){
        return banMenu;
    }
}
