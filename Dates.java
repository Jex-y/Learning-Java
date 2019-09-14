import java.sql.SQLOutput;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.LocalTime;
import java.time.LocalDate;

class Dates {
    public static void main(String[] args) {
        LocalDateTime myDateTime = LocalDateTime.of(2019, 8, 5, 19, 27, 0);

        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyy HH:mm");
        String formattedDate = myDateTime.format(myFormatObj);
        System.out.println(formattedDate);

        LocalDate myDate = LocalDate.of(2019, 8, 5);

        LocalTime myTime = LocalTime.of(19, 30, 0);

        System.out.println(myDate + " at" + myTime);

    }
}
