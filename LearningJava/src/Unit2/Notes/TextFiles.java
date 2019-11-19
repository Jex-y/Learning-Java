package Unit2.Notes;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

@SuppressWarnings("SameParameterValue")
public class TextFiles {
    public static void main(String[] args) {
        final String filePath = "src\\Unit2\\Notes\\Output Files\\testFile.txt";
        destructiveWrite("Hello", filePath, " ");
        appendWrite("World", filePath);

        System.out.println("Read: " + fileRead(filePath));
    }

    public static boolean destructiveWrite(String str, String outputFile) {
        return destructiveWrite(str, outputFile, "\n");
    }

    private static boolean destructiveWrite(String str, String outputFile, String eof) {
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

    private static boolean appendWrite(String str, String outputFile) {
        return appendWrite(str, outputFile, "\n");
    }

    private static boolean appendWrite(String str, String outputFile, String eof) {
        boolean result = false;
        try {
            FileWriter writer = new FileWriter(outputFile, true);
            writer.append(str + eof);
            writer.close();
            System.out.println("Successfully wrote to " + outputFile);
            result = true;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return true;
    }

    private static String fileRead(String inputFile) {
        char data = 0;
        String outputData = "";
        try {
            FileReader reader = new FileReader(inputFile);
            data = (char) reader.read();
            while (data != (char) -1) {
                outputData += data;
                data = (char) reader.read();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return outputData;
    }
}
