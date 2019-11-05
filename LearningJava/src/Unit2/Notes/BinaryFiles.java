package Unit2.Notes;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BinaryFiles {
    public static void main(String[] args) {
        final String path = "src\\Unit2\\Notes\\Output Files\\binaryTestFile.txt";
        String stringToWrite = "Hello world!";
        writeString(stringToWrite,path);
        System.out.println("Read: " + readString(path));
    }

    private static boolean writeString(String str, String path) {
        boolean result = false;
        try {
            FileOutputStream fout = new FileOutputStream(path);
            /*
            for (int i = 0; i < str.length(); i++) {
                fout.write((byte)str.charAt(i));
            }
             */
            byte[] data = str.getBytes();
            fout.write(data);
            fout.close();
            result = true;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }

    private static String readString(String path) {
        char data;
        StringBuilder output = new StringBuilder();
        try {
            FileInputStream fin = new FileInputStream(path);
            data = (char)fin.read();
            while (data != (char)-1){
                output.append(data);
                data = (char)fin.read();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return output.toString();
    }
}
