package Day4;

import java.util.Scanner;

public class ForLoops {
    public static void main(String[] args) throws InterruptedException {

        Scanner sc = new Scanner(System.in);

        System.out.print("How many seconds to countdown from?: ");
        int start = sc.nextInt();

        for (int i = start; i > 0; i--) {
            System.out.println(i);
            Thread.sleep(700);
        }

        System.out.println("HAPPY NEW YEAR!");




    }
}
