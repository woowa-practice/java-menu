package menu.view;

import java.util.List;

public class OutputView {

    public void startMenuSuggestion(){
        System.out.println("점심 메뉴 추천을 시작합니다.");
    }

    public void outputSuggestionMenu(List<String> category, List<String> coach, List<String> menu){
        System.out.println("메뉴 추천 결과입니다.\n" +
                "[ 구분 | 월요일 | 화요일 | 수요일 | 목요일 | 금요일 ]");
        System.out.print("[ 카테고리");
        category.forEach(s -> System.out.print(" | "+s));
        System.out.println(" ]");
        for (String c : coach) {
            System.out.print("[ "+c);
            menu.forEach(m-> System.out.print(" | "+m));
            System.out.println(" ]");
        }
        System.out.println("\n추천을 완료했습니다.");
    }
}
