package menu.util;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class inputValidator {
    private inputValidator(){}

    public static void validateCoachInput(String input){
        noInput(input);
        List<String> s= parser(input);
        coachNameIsNull(s);
        nameOfCoachLessThanTwo(s);
        nameOfCoachMoreThanFour(s);
        coachLessThanTwo(s);
        coachMoreThanFive(s);
    }

    public static void validateMenuInput(String input){
        List<String> s=parser(input);
        menuNameIsNull(s);
        menuMoreThanTwo(s);
    }

    private static void noInput(String input){
        if(input.isBlank()){
            throw new IllegalArgumentException("[ERROR] name can not blank");
        }
    }

    private static void coachNameIsNull(List<String> s){
        for (String coachName : s) {
            if(coachName==null){
                throw new IllegalArgumentException("[ERROR] name can not null");
            }
        }
    }

    private static void nameOfCoachLessThanTwo(List<String> s){
        for (String coachName : s) {
            if(coachName.length()<2){
                throw new IllegalArgumentException("[ERROR] input at least two letter");
            }
        }
    }

    private static void nameOfCoachMoreThanFour(List<String> s){
        for (String coachName : s) {
            if(coachName.length()>4){
                throw new IllegalArgumentException("[ERROR] input limit is four");
            }
        }
    }

    private static void coachLessThanTwo(List<String> s){
        if(s.size()<2){
            throw new IllegalArgumentException("[ERROR] input at least two coach");
        }
    }

    private static void coachMoreThanFive(List<String> s){
        if(s.size()>5){
            throw new IllegalArgumentException("[ERROR] input limit is five");
        }
    }

    private static void menuNameIsNull(List<String> s){
        for (String menu : s) {
            if(menu==null){
                throw new IllegalArgumentException("[ERROR] menu can not null");
            }
        }
    }

    private static void menuMoreThanTwo(List<String> s){
        if(s.size()>2){
            throw new IllegalArgumentException("[ERROR] input limit is two");
        }
    }

    private static List<String> parser(String input){
        List<String> beParsed= Arrays.stream(input.split(","))
                .map(String::trim)
                .collect(Collectors.toList());

        return beParsed;
    }
}
