package Day3;

public class Switches {
    public static void main(String[] args) {

        String day = "Mayday";

        switch (day) {
            case "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" -> System.out.println("It is a weekday😩");

            case "Saturday", "Sunday" -> System.out.println("It is the weekend!😁");

            default -> System.out.println(day + " is not a day");
        }

    }
}
