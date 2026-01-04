package menu.domain;

import camp.nextstep.edu.missionutils.Randoms;

import java.util.List;

public class RandomMenu {

    public static String randomMenu(List<String> menu) {
        return Randoms.shuffle(menu).get(0);
    }
}
