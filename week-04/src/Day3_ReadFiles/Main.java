package Day3_ReadFiles;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        // BufferedReader + FileReader = best for reading text files line by line
        // FileInputStreamOutput = best for binary files like images, audio files eyc.
        //  RandomAccessFile = best for read/write specific portions of a large file

        String filePath = "/Users/elaine/Desktop/test.txt";

        try(BufferedReader  br = new BufferedReader(new FileReader(filePath));){
            String line;
            while((line = br.readLine()) != null){
                System.out.println(line);
            }
        }
        catch (FileNotFoundException e) {
            System.out.println("Could not locate file");
        }
        catch (IOException e) {
            System.out.println("Something went wrong");
        }





    }
}
