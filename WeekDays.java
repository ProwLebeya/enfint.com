package assignment.questionThree;

public class WeekDays {

    public static final WeekDays MONDAY = new WeekDays("MONDAY",0);
    public static final WeekDays TUESDAY = new WeekDays("TUESDAY",1);
    public static final WeekDays WEDNESDAY = new WeekDays("WEDNESDAY",2);
    public static final WeekDays THURSDAY = new WeekDays("THURSDAY",3);
    public static final WeekDays FRIDAY = new WeekDays("FRIDAY",4);
    public static final WeekDays SATURDAY = new WeekDays("SATURDAY",5);
    public static final WeekDays SUNDAY = new WeekDays("SUNDAY",6);

    private String day;
    public static final WeekDays[] values = {MONDAY,TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY};
    

    private WeekDays(String day, int ordinal){
        this.day = day;
    }

    public String getDay(){
        return day;
    }

    @Override
    public String toString() {
        return day;
    }

    public static WeekDays[] values(){
        return values;
    }

    public static String valueOf(WeekDays days){
        return days.getDay();
    }
}
