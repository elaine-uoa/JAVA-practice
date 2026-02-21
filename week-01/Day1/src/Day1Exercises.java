import java.util.Random;

public class Day1Exercises {

    public static void main(String[] args) {

        Random random = new Random();
        boolean isHeads;

        isHeads = random.nextBoolean();

        if (isHeads) {
            System.out.println("It's a head!");
        }  else {
            System.out.println("It's a tail!");
        }

    }
}
