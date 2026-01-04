package menu.domain;

import camp.nextstep.edu.missionutils.Randoms;

public class RandomCategory {
    private static final int FIRST = 1;
    private static final int LAST = 5;

    public static int randomCategory() {
        return Randoms.pickNumberInRange(FIRST, LAST);
    }
}
