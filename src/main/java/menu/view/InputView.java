package menu.view;

import camp.nextstep.edu.missionutils.Console;
import menu.util.InputValidator;

public class InputView {

    public String inputCoachName() {

        while (true) {
            try {
                System.out.println("코치의 이름을 입력해 주세요. (, 로 구분)");
                String input = Console.readLine();

                InputValidator.validateCoachInput(input);

                return input;
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public String inputBanMenu(String coach) {
        while (true) {
            try {
                System.out.println(coach + "(이)가 못 먹는 메뉴를 입력해 주세요.");
                String input = Console.readLine();

                InputValidator.validateMenuInput(input);

                return input;
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
