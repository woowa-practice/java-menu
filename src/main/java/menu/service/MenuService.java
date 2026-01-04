package menu.service;

import menu.repository.CategoryRepository;
import menu.repository.CoachRepository;
import menu.repository.MenuRepository;

public class MenuService {
    private final CategoryRepository categoryRepository;
    private final MenuRepository menuRepository;
    private final CoachRepository coachRepository;

    public MenuService(CategoryRepository categoryRepository, MenuRepository menuRepository,
                       CoachRepository coachRepository){
        this.categoryRepository=categoryRepository;
        this.menuRepository=menuRepository;
        this.coachRepository=coachRepository;
    }

    public void
}
