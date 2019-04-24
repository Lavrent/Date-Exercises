import java.time.LocalDate;
import java.util.Scanner;

public class Year_Of_Birth {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("input the age");
        int age = in.nextInt();
       int year_of_birth = LocalDate.now().getYear()-age;
        System.out.println("the year of birth is " + year_of_birth);
    }
}
