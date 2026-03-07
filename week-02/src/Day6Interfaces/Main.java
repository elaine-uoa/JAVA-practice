package Day6Interfaces;

public class Main {

    public static void main(String[] args) {

        Rabbit rabbit = new Rabbit();
        Hawk hawk = new Hawk();
        Fish fish = new Fish();

       fish.flee();
       fish.hunt();

    }
}
