package Unit2.SLRS;

import java.io.*;

public class SLR4_02 {
    public static void main(String[] args) {
        String outputDir = "src\\Unit2\\SLRS\\Output Files\\";
        String sampleText = "My shopping list is:\n\tEggs\n\tMilk\n\tButter\n\tFood";
        writeLines(sampleText,outputDir);
        System.out.println(readLines(outputDir + "shoppingList.txt"));
        binaryWrite("Edward Jex",outputDir+"name.txt");
        binaryRead(outputDir + "name.txt");

    }

    private static boolean writeLines(String str, String outputDir) {
        boolean result = false;
        String outputFile = outputDir + "shoppingList.txt";
        try {
            FileWriter writer = new FileWriter(outputFile);
            writer.write(str + "\n");
            writer.close();
            System.out.println("Successfully wrote to " + outputFile);
            result = true;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }

    private static String readLines(String readFile) {
        char data;
        StringBuilder outputData = new StringBuilder();
        try {
            FileReader reader = new FileReader(readFile);
            data = (char)reader.read();
            while (data != (char)-1){
                outputData.append(data);
                data = (char)reader.read();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        String output = outputData.toString();
        System.out.println(output);
        return output;
    }

    private static void binaryWrite(String str, String writeFile){
        try {
            FileOutputStream fout = new FileOutputStream(writeFile);
            byte[] data = str.getBytes();
            fout.write(data);
            fout.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static String binaryRead(String readFile){
        char data;
        StringBuilder output = new StringBuilder();
        try {
            FileInputStream fin = new FileInputStream(readFile);
            data = (char)fin.read();
            int dataBin;
            while (data != (char)-1){
                output.append(data);
                dataBin = fin.read();
                System.out.printf("0x%08x\t",dataBin);
                data = (char)dataBin;
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return output.toString();
    }
}
