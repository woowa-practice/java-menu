package menu.domain;

import camp.nextstep.edu.missionutils.Randoms;

public class RandomCategory {
    private static final Integer FIRST=1;
    private static final Integer LAST=5;

    public static Integer randomCategory(){
        return Randoms.pickNumberInRange(FIRST, LAST);
    }
}
