package menu.controller;

import menu.domain.Coach;
import menu.domain.Coaches;
import menu.service.MenuService;
import menu.view.InputView;
import menu.view.OutputView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MenuController {
    private final InputView inputView;
    private final OutputView outputView;
    private final MenuService menuService;

    public MenuController(InputView inputView, OutputView outputView,
                          MenuService menuService) {
        this.inputView = inputView;
        this.outputView = outputView;
        this.menuService = menuService;
    }

    public void run() {
        outputView.startMenuSuggestion();

        String coachName = inputView.inputCoachName();
        List<String> coachNames = Arrays.stream(coachName.split(","))
                .map(String::trim)
                .collect(Collectors.toList());

        List<Coach> coachList = new ArrayList<>();

        for (String name : coachNames) {
            String banMenu = inputView.inputBanMenu(name);
            List<String> banMenus = Arrays.stream(banMenu.split(","))
                    .map(String::trim)
                    .collect(Collectors.toList());
            Coach coach = new Coach(name, banMenus);
            coachList.add(coach);
        }

        Coaches coaches = new Coaches(coachList);

        List<String> resultCategory = menuService.suggest(coaches);

        outputView.outputSuggestionMenu(resultCategory, coaches);
    }
}
