package Unit2.Notes;

import java.io.FileWriter;
import java.io.IOException;

public class Files {
    public static void main(String[] args) {
        final String outputFile = "testfile.txt";
        destructiveWrite("Hello",outputFile," ");
        appendWrite("World",outputFile);
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
}
