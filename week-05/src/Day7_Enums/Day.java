package Day7_Enums;

public enum Day {
    /*
    Think of each enum constant like a little object.
    For example:
    SUNDAY is an object of type Day
    MONDAY is also an object of type Day
    And each object stores its own dayNumber.
     */
    SUNDAY(1), MONDAY(2), TUESDAY(3), WEDNESDAY(4), THURSDAY(5), FRIDAY(6), SATURDAY(7);

    private final int dayNumber;

    Day(int dayNumber) {
        this.dayNumber = dayNumber;
    }

    public int getDayNumber() {
        return this.dayNumber;
    }

}
