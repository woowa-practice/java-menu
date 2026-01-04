package menu.domain;

import java.util.List;
import java.util.Map;

public class Coach {
    private final String name;
    private final Map<String, Integer> category;
    private final List<String> menu;
    private final List<String> banMenu;

    public Coach(String name, Map<String, Integer> category, List<String> menu, List<String> banMenu){
        this.name=name;
        this.category=category;
        this.menu=menu;
        this.banMenu=banMenu;
    }

    public String getName(){
        return name;
    }

    public Map<String, Integer> getCategory(){
        return category;
    }

    public List<String> getMenu() {
        return menu;
    }

    public List<String> getBanMenu(){
        return banMenu;
    }
}
