package Day4_Composition;

public class Main {

    public static void main(String[] args) {

        Car car = new Car("Suzuki", 2025, "V7");

        System.out.println(car.model);
        System.out.println(car.year);
        System.out.println(car.engine.type);

        car.start();

    }
}
