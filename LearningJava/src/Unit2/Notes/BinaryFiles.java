package Unit2.Notes;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BinaryFiles {
    public static void main(String[] args) {
        final String path = "binaryTestfile";
        String stringToWrite = "Hello world!";
        writeString(stringToWrite,path);
        System.out.println("Read: " + readString(path));
    }

    public static boolean writeString(String str,String path) {
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

    public static String readString(String path) {
        char data;
        String output = "";
        try {
            FileInputStream fin = new FileInputStream(path);
            data = (char)fin.read();
            while (data != (char)-1){
                output += data;
                data = (char)fin.read();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return output;
    }
}
