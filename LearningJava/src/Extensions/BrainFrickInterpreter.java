package Extensions;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class BrainFrickInterpreter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("File Path: ");
        //String path = input.nextLine();
        String path = "helloWorld.bf";
        String program = fileRead("F:\\code\\School\\LearningJava\\src\\Extensions\\" + path);
        System.out.printf(program);

    }
    private static String fileRead(String inputFile){
        char data = 0;
        String outputData = "";
        try {
            FileReader reader = new FileReader(inputFile);
            data = (char)reader.read();
            while (data != (char)-1){
                outputData += data; // Strip chars don't care about using cool regex
                data = (char)reader.read();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return outputData;
    }
}
