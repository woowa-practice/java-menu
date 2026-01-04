package menu;

import menu.config.DataLoader;
import menu.repository.CategoryRepository;
import menu.repository.MenuRepository;
import org.junit.jupiter.api.Test;

public class 데이터로드테스트 {
    private DataLoader dataLoader=new DataLoader();

    @Test
    void 데이터로드테스트(){
        dataLoader.loadData();
        CategoryRepository.getCategorys().forEach(s-> System.out.println(s.getCategoryName()));
        MenuRepository.getMenus().forEach(s-> System.out.println(s.getName()));
    }
}
