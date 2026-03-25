package Day3_Timertasks;

import java.util.Timer;
import java.util.TimerTask;

public class Main {

    public static void main(String[] args) {
        //Timer = class that schedules tasks at specific times or periodically.
        //useful for sending notifications, scheduled updates, repetitive actions

        //Timertask = represents the task that will be executed by the Timer
        //you will extend the TimerTask class to define your task
        //create a subclass of Timertask and @Override run()

        Timer timer = new Timer();
        TimerTask timerTask = new TimerTask() {

            int count = 7;

            @Override
            public void run() {
                System.out.println("Hello!");
                count--;
                if (count <= 0) {
                    System.out.println("Task completed");
                    timer.cancel();
                }
            }
        };

        timer.schedule(timerTask, 0, 1000);


    }
}
