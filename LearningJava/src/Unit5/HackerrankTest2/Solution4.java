package Unit5.HackerrankTest2;

        import java.util.Scanner;

public class Solution4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String [] colours = new String[5];
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter the name of a colour");
            colours[i] = input.nextLine();
        }
        System.out.println("Enter the name of a colour to find");
        String find = input.nextLine();
        int count = 0;
        for (String col: colours) {
            if (col.equals(find)){
                count ++;
            }
        }
        System.out.printf("Found %d occurrences of %s\n",count, find);
    }
}
