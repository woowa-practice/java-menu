package menu.service;

import menu.domain.*;

import java.util.ArrayList;
import java.util.List;

public class MenuService {
    private final List<CategoryType> categoryTypes=new ArrayList<>();

    public List<String> suggest(Coaches coaches){
        for(int i=0; i<5; i++){
            categoryTypes.add(pickCategory());
            for (Coach coach : coaches.getCoaches()) {
                suggestMenu(coach, categoryTypes.get(i));
            }
        }

        List<String> categoryNames=new ArrayList<>();
        for (CategoryType categoryType : categoryTypes) {
            categoryNames.add(categoryType.getCategoryName());
        }

        return categoryNames;
    }

    private CategoryType pickCategory(){
        while(true){
            CategoryType category=CategoryType.from(RandomCategory.randomCategory());

            int count=(int) categoryTypes.stream()
                    .filter(c->c==category)
                    .count();

            if(count<2) return category;
        }
    }

    private void suggestMenu(Coach coach, CategoryType category){
        List<String> menuList=category.getMenuList();
        while(true){
            String menu= RandomMenu.randomMenu(menuList);
            if(coach.canEat(menu)) {
                coach.eat(menu);
                break;
            }
        }
    }
}
