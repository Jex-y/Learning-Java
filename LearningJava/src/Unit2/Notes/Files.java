package Unit2.Notes;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Files {
    public static void main(String[] args) {
        final String filePath = "testfile.txt";
        destructiveWrite("Hello",filePath," ");
        appendWrite("World",filePath);

        System.out.println("Read: " + fileRead(filePath));
    }

    public static boolean destructiveWrite(String str, String outputFile) {
        return destructiveWrite(str,outputFile,"\n");
    }

    public static boolean destructiveWrite(String str,String outputFile,String eof) {
        boolean result = false;
        try {
            FileWriter writer = new FileWriter(outputFile);
            writer.write(str + eof);
            writer.close();
            System.out.println("Successfully wrote to " + outputFile);
            result = true;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }

    public static boolean appendWrite(String str, String outputFile) {
        return  appendWrite(str,outputFile,"\n");
    }
    public static boolean appendWrite(String str, String outputFile, String eof) {
        boolean result = false;
        try {
            FileWriter writer = new FileWriter(outputFile, true);
            writer.append(str+eof);
            writer.close();
            System.out.println("Successfully wrote to " + outputFile);
            result = true;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return true;
    }

    public static String fileRead(String inputFile){
        char data = 0;
        String outputData = "";
        try {
            FileReader reader = new FileReader(inputFile);
            while (data != (char)-1){
                data = (char)reader.read();
                outputData += data;

            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return outputData;
    }
}
