package assignment.questionThree;

public class TestCustomEnum {
    public static void main(String[] args){
        System.out.println(WeekDays.TUESDAY);
        System.out.println(WeekDays.valueOf(WeekDays.SUNDAY));

        for(WeekDays days: WeekDays.values()){
            System.out.printf("%s only comes once in a week %n", days);
        }
    }
}
