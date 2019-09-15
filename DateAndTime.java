import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateAndTime {
    public static void main(String[] args) {
        LocalDateTime myDateTime = LocalDateTime.now();

        System.out.println(myDateTime);

        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyy HH:mm:ss");
        String formattedDate = myDateTime.format(myFormatObj);

        System.out.println("After formatting: " + formattedDate);
    }
}
