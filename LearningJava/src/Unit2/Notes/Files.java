package Unit2.Notes;

import java.io.FileWriter;
import java.io.IOException;

public class Files {
    public static void main(String[] args) {
        final String outputFile = "testfile.txt";
        String str = "Hello World";

        try {
            FileWriter writer = new FileWriter(outputFile);
            writer.write(str + "\n");
            writer.close();
            System.out.println("Succsessfully wrote to " + outputFile);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
