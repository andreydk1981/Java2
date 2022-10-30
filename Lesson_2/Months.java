package Lesson_2;

public enum Months {
    JAN("january", 1),
    FEB("february",2),
    MAR("march",3),
    APR("april",4),
    MAY("may",5);

    private final String fullName;
    private final int number;

    Months(String fullName, int number) {
        this.fullName = fullName;
        this.number = number;
    }

    public String getFullName() {
        return fullName;
    }

    public int getNumber() {
        return number;
    }

    boolean isSpring(){
        return this == APR || this == MAR || this == MAY;
    }
}
