package menu.domain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Coaches {
    private final List<Coach> coaches;

    public Coaches(List<Coach> coaches){
        this.coaches=new ArrayList<>(coaches);
    }

    public void suggestCategory(String categoryName){
        for (Coach coach : coaches) {
            coach.addCategory(categoryName);
        }
    }

    public void suggestMenu(String menuName){
        for (Coach coach : coaches) {
            coach.addMenu(menuName);
        }
    }

    public List<Coach> getCoaches(){
        return Collections.unmodifiableList(coaches);
    }
}
