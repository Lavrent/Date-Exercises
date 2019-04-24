import java.time.LocalDate;
import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("input the year");
        int year = in.nextInt();
        if (LocalDate.now().withYear(year).isLeapYear())
            System.out.println("the year " + year + " is leap");
        else
            System.out.println("the year " + year + " is not leap");
    }
}
