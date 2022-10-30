package Lesson_2;

public class App {
    public static void main(String[] args) {
       //Months [] months = new Months[]{Months.JAN,Months.FEB,Months.MAR, Months.APR, Months.MAY, Months.JUN};
        for (Months month : Months.values()) {
            System.out.println(String.format("%d %s %s %d %b", month.ordinal(), month, month.getFullName(),month.getNumber(), month.isSpring()));
        }
        Months months = Months.APR;
        switch (months){
            case JAN:
            case FEB:{
                System.out.println("Winter");
                break;}
            case MAR:
            case APR:
            case MAY:{
                System.out.println("Spring");
                break;
            }
        }
    }

}
