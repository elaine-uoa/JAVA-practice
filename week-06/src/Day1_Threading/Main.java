package Day1_Threading;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Threading = allows a program to run multiple tasks simultaneously. helps improve performance with time-consuming operations, like file I/O, network communications, or any background tasks
        //how to create a Thread
        //option 1. extend the Thread class (simpler)
        //option 2. implement the Runnable interface (better)

        //Runnable defines the task (what to do), and Thread executes that task concurrently (runs it independently).
        //1. You run the program
        //2. JVM creates main thread
        //3. Main thread enters main()
        //4. Starts executing line by line
        //For every standard Java application, the JVM creates a main thread first, and that thread starts executing the main() method (the program’s entry point).

        Scanner sc = new Scanner(System.in);

        MyRunnable myRunnable = new MyRunnable();
        Thread thread = new Thread(myRunnable);
        thread.setDaemon(true);//it ends when the main thread is over
        thread.start();

        System.out.println("You have 5 seconds to enter your name");

        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        System.out.println("Hello, " + name);

        sc.close();
    }
}
