package Day2;
import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double temp;
        double newTemp;
        String unit;

        System.out.print("Enter the temperature: ");
        temp = sc.nextDouble();

        System.out.print("Convert to Celsius or Fahrenheit? (C or F): ");
        unit = sc.next().toUpperCase();

        //(condition) ? true : false
        newTemp = (unit.equals("C")) ? (temp - 32) * 5 / 9 : (temp * 5 / 9) + 32;

        System.out.printf("%.1f°%s" , newTemp, unit);

        sc.close();
    }
}
