package Unit4;
import java.util.Scanner;

public class RLE {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter text to be compressed: ");
        String text = input.nextLine();
        int count = 0;
        char last_chr = (char)0;
        for (char chr : text.toCharArray()) {
            if (chr == last_chr) {
                count++;
            } else if (last_chr == (char)0) {
                last_chr = chr;
                count = 1;
            } else {
                System.out.printf("%s %d ",last_chr, count);
                last_chr = chr;
                count = 1;
            }
        }
        System.out.printf("%s %d\n",last_chr, count);

        System.out.println("Enter text to be decompressed: ");
        String [] encoded = input.nextLine().split(" ");
        char chr;
        int length;
        for (int i = 0; i < encoded.length; i += 2) {
            chr = encoded[i].charAt(0);
            length = Integer.parseInt(encoded[i+1]);
            for (int j = 0; j < length; j++) {
                System.out.printf("%s",chr);
            }
        }
    }
}
