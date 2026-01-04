package menu.domain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Coach {
    private final String name;
    private final List<String> banMenu;
    private final List<String> eatenMenu;

    public Coach(String name, List<String> banMenu, List<String> eatenMenu){
        this.name=name;
        this.banMenu=banMenu;
        this.eatenMenu=new ArrayList<>();
    }

    public boolean canEat(String menuName){
        if(banMenu.contains(menuName)) return false;

        if(eatenMenu.contains(menuName)) return false;

        return true;
    }

    public void eat(String menuName){
        eatenMenu.add(menuName);
    }

    public String getName(){
        return name;
    }

    public List<String> getEatenMenu(){
        return Collections.unmodifiableList(eatenMenu);
    }

}
