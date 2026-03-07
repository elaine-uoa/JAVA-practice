package Day5Inheritance;

public class Animal {

    String name;

    Animal(String name) {
        this.name = name;
    }

    void live() {
        System.out.println(this.name + " is alive.");
    }

}
