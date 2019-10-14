import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        dataFrame times = dataFrame.fromCSV("testData.csv");
        times.print();
    }
}


class dataFrame {
    field[] data;
    String [] rows;

    public dataFrame(field[] data) {
        this.data = data;
    }

    public void print() {
        for (int i = 0; i < this.data[0].length; i++) {
            System.out.printf("| ");
            for (field f: data) {
                System.out.print(f.get(i));
                System.out.print("\t");
            }
            System.out.printf("|\n");
        }
    }

    public static dataFrame fromCSV(String filePath) throws IOException {
        FileInputStream in = null;
        int rowCount = 0;
        int colCount = 1;

        try {
            in = new FileInputStream(filePath);
            int c;

            while ((c = in.read()) != -1) {
                if (c == (int)('\n')){
                    rowCount++;
                }
                if (rowCount == 0 && (c == (int) (',') || c == (int) ('\t'))) {
                    colCount++;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        field[] dataBuffer = new field[colCount];

        try {
            in.close();
            in = new FileInputStream(filePath);
            String buffer = "";
            String[] names = new String[rowCount];
            int fieldIndex = 0;
            int itemIndex = -1;
            int c;

            while((c = in.read()) != -1) {
                switch (c) {
                    case ((int)('\r')):
                        itemIndex = 0;
                        break;
                    case ((int)('\n')):
                        if (itemIndex != -1) {
                            if(isInteger(buffer)) {
                                dataBuffer[fieldIndex] = new field<Integer>(rowCount, buffer);
                            }
                            else {
                                dataBuffer[fieldIndex] = new field<String>(rowCount, buffer);
                            }
                            buffer = "";
                        }
                        else {
                            dataBuffer[fieldIndex].set(itemIndex,Integer.parseInt(buffer));
                            buffer = "";
                        }
                        fieldIndex = 0;
                        itemIndex ++;
                        break;

                    case ((int)(',')):
                    case ((int)('\t')):
                        if (itemIndex != -1) {
                            System.out.println(buffer);
                            if(isInteger(buffer)) {
                                dataBuffer[fieldIndex].set(itemIndex,Integer.parseInt(buffer));
                            }
                            else {
                                dataBuffer[fieldIndex].set(itemIndex,buffer);
                            }
                            buffer = "";
                        } else {
                            if(isInteger(buffer)) {
                                dataBuffer[fieldIndex] = new field<Integer>(rowCount, buffer);
                            }
                            else {
                                dataBuffer[fieldIndex] = new field<String>(rowCount, buffer);
                            }
                            buffer = "";
                        }
                        fieldIndex++;
                        break;
                    default:
                        buffer += (char)c;
                }
            }
            in.close();
        } catch (FileNotFoundException e) {
            System.err.printf("File [%s] not Found!\n",filePath);
            return null;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        } finally {
            if (in != null) {
                in.close();
            }
        }
        return new dataFrame(dataBuffer);
    }

    private static boolean isInteger(String s) {
        try {
            Integer.parseInt(s);
        } catch(NumberFormatException e) {
            return false;
        } catch(NullPointerException e) {
            return false;
        }
        return true;
    }
}

class field<dataType> {
    List<dataType> values;
    int length;
    String name;

    public field(int length, String name){
        this.values = new ArrayList<dataType>();
        this.length = length;
        this.name = name;
        for (int i = 0; i < length; i++) {
            this.values.add(null);

        }

    }

    public dataType get(int index) throws IndexOutOfBoundsException {
        if (index > length) {
            throw new IndexOutOfBoundsException();
        } else {
            return this.values.get(index);
        }
    }

    public void set(int index, dataType value) throws IndexOutOfBoundsException {
        if (index > length) {
            throw new IndexOutOfBoundsException();
        } else {
            this.values.set(index,value);
        }
    }
}