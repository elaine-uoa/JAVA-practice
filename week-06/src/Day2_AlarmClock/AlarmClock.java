package Day2_AlarmClock;

import javax.sound.sampled.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.time.LocalTime;
import java.util.Scanner;

public class AlarmClock implements Runnable{

    private final LocalTime alarmTime;
    private final String filePath;
    private final Scanner sc;

    public AlarmClock(LocalTime alarmTime, String filePath, Scanner sc) {
        this.alarmTime = alarmTime;
        this.filePath = filePath;
        this.sc = sc;
    }

    @Override
    public void run(){

        while(LocalTime.now().isBefore(alarmTime)){
            try{
                Thread.sleep(1000);

                LocalTime now = LocalTime.now();

                System.out.printf("\r%02d:%02d:%02d",
                       now.getHour(), now.getMinute(), now.getSecond());
            }
            catch(InterruptedException e){
                System.out.println("Thread was interrupted");
            }
        }

        System.out.println("**ALARM NOISE**");
        playSound(filePath);
    }

    private void playSound(String filePath){

        File audiofile = new File(filePath);

        try(AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(audiofile)){
            Clip clip = AudioSystem.getClip();
            clip.open(audioInputStream);
            clip.start();
            System.out.print("Press *Enter* to stop the alarm: ");
            sc.nextLine();
            clip.stop();
            sc.close();
        }
        catch (UnsupportedAudioFileException e){
            System.out.println("Audio file format not supported");
        }
        catch (LineUnavailableException e) {
            System.out.println("Audio not available");
        }
        catch (IOException e) {
            System.out.println("Error reading audio file");
        }
    }
}
