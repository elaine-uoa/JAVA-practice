package Day3_WriteFiles;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        // FileWriter = good for small or medium-sized text files
        // BufferedWriter = better performance for large amounts of text
        // PrintWriter = best for structured data, like reports or logs
        // FileOutputStream = best for binary files, e.g. images, audio files

        String filePath = "/Users/elaine/Desktop/test.txt";
        String textContent = "Hello World\nAnd I'm ready:)\n...hopefully";//"""  """; for multi lines

        try(FileWriter fw = new FileWriter(filePath);){
            fw.write(textContent);
            System.out.println("File has been written");
        }
        catch (FileNotFoundException e) {
            System.out.println("Could not locate file location");
        }
        catch(IOException e){
            System.out.println("Could not write file");
        }


    }
}
