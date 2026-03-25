package Day3_AnonymousClasses;

public class Main {

    public static void main(String[] args) {
        //Anonymous class = A class that doesn't have a name. cannot be reused.
        //add custom behaviors without having to create a new class.
        //often used for one time uses (TimerTask, Runnable, callbacks)

        Dog dog1 = new Dog();
        Dog dog2 = new Dog(){
            @Override
            void speak() {
                System.out.println("Goofy says *Hi*");
            }
        };

        dog1.speak();
        dog2.speak();

    }
}
