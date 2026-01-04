package menu.view;

import menu.domain.Coach;
import menu.domain.Coaches;

import java.util.List;

public class OutputView {

    public void startMenuSuggestion(){
        System.out.println("점심 메뉴 추천을 시작합니다.");
    }

    public void outputSuggestionMenu(List<String> categoryNames, Coaches coaches){
        System.out.println("메뉴 추천 결과입니다.\n" +
                "[ 구분 | 월요일 | 화요일 | 수요일 | 목요일 | 금요일 ]");


        System.out.print("[ 카테고리");
        categoryNames.forEach(s -> System.out.print(" | "+s));
        System.out.println(" ]");

        List<Coach> coachList=coaches.getCoaches();
        for (Coach coach : coachList) {
            System.out.print("[ "+coach.getName());
            coach.getEatenMenu().forEach(m-> System.out.print(" | "+m));
            System.out.println(" ]");
        }

        System.out.println("\n추천을 완료했습니다.");
    }
}
