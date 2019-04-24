import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;
import java.util.zip.DataFormatException;

public class date_validation_and_difference {
    public static void main(String[] args) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        Scanner in = new Scanner(System.in);
        System.out.println("print the date");
        String str = in.nextLine();
        LocalDate date = LocalDate.parse(str, formatter);
        LocalDate currentDate = LocalDate.parse(LocalDate.now().format(formatter),formatter);
        System.out.println("the difference of date with current date is " + ChronoUnit.DAYS.between(date,currentDate ) + " days");


    }
}
