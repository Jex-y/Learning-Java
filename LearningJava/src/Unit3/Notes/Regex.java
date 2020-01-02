package Unit3.Notes;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String regex = "ab*(a|b)";
        System.out.printf("Pattern is \"%s\"\n",regex);
        System.out.println("Enter a string to math against this pattern:");
        String data = input.nextLine();
        System.out.println(Pattern.matches(regex, data));

        regex = "ab*";
        String text = "abbbabbabba";
        Pattern pattern = Pattern.compile(regex);
        Matcher match = pattern.matcher(text);
        System.out.printf("Pattern is \"%s\", string is \"%s\"\n",regex,text);
        while (match.find()) {
            System.out.printf("Pattern found from %d to %d\n",match.start(), match.end()-1);
        }
    }
}
