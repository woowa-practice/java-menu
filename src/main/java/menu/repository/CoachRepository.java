package menu.repository;

import menu.domain.Coach;

import java.util.*;

public class CoachRepository {
    private static final List<Coach> coachs=new ArrayList<>();

    public static List<Coach> getCoachs() {
        return Collections.unmodifiableList(coachs);
    }

    public static void addCoach(Coach coach){
        coachs.add(coach);
    }
}
