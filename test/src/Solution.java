import java.time.LocalDate;
import java.util.Scanner;
        import java.lang.Math;
        import java.time.format.DateTimeFormatter;
        import java.time.LocalDateTime;

public class Solution {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //q1(input);
        //q2(input);
        //q3(input);
        q4(input);
        //q5(input);
        //q6();
    }

    static void q1(Scanner input) {
        System.out.println("Enter the first number");
        int num1 = Integer.parseInt(input.nextLine());

        System.out.println("Enter the second number");
        int num2 = Integer.parseInt(input.nextLine());

        int diff = Math.abs(num1 - num2);

        System.out.printf("The difference is %d\n",diff);
    }

    static void q2(Scanner input) {
        boolean valid = false;
        while (!valid) {
            System.out.println("Enter a colour");
            String col = input.nextLine().toLowerCase();
            switch (col) {
                case "red":
                case "blue":
                case "green":
                    System.out.println("Thank you");
                    valid = true;
                    break;
                default:
                    System.out.println("You must enter red, green or blue");
            }
        }
    }

    static void q3(Scanner input) {
        System.out.println("Enter a phrase");
        String phrase = input.nextLine();
        String output = "";
        char chr;
        for (int index = 0; index < phrase.length(); index ++) {
            chr = phrase.charAt(index);
            switch (chr) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    break;
                default:
                    output += chr;
            }
        }
        System.out.println(output);
    }

    static void q4(Scanner input) {
        System.out.println("Enter a date");
        String dateRaw = input.nextLine();
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("d-MMM-yyyy");
        LocalDate date = LocalDate.parse(dateRaw,dateFormatter);

        System.out.printf("That is a %s\n",date.getDayOfWeek());

        if (date.isBefore(LocalDate.now())) {
            System.out.println("That date is before today");
        } else {
            System.out.println("That date is after today");
        }

        if (date.isLeapYear()) {
            System.out.printf("%s is a leap year\n",date.getYear());
        } else {
            System.out.printf("%s is not a leap year\n",date.getYear());
        }

    }

    static void q5(Scanner input) {
        String data = "";
        String itemBuffer = "";
        String costBuffer = "";
        boolean pastColon = false;
        char chr;
        double total = 0;
        System.out.println("Enter the data");
        data = input.nextLine();
        while(!data.equals("STOP")) {
            for (int index = 0; index < data.length(); index++) {
                chr = data.charAt(index);
                if (chr == ':') {
                    pastColon = true;
                } else if (!pastColon) {
                    itemBuffer += chr;
                } else {
                    costBuffer += chr;
                }
            }
            total += Double.parseDouble(costBuffer);
            itemBuffer = "";
            costBuffer = "";
            pastColon = false;
            System.out.println("Enter the data");
            data = input.nextLine();
        }
        System.out.printf("John spent a total of £%.2f\n",total);
    }

    static void q6() {
        int[] numbers = {1,1,1,1,1};
        int lastNum = numbers[0];
        int count = 0;
        for (int num: numbers) {
            if (num == lastNum){
                count += 1;
            } else if (count > 1) {
                System.out.printf("%d was found %d times\n",lastNum,count);
                count = 1;
            }
            lastNum = num;
        }
    }
}

