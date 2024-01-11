import java.text.DateFormatSymbols;
import java.util.Scanner;

public class ShortDateConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a short date (YYYY-MM-DD): ");
        String shortDate = scanner.nextLine();

    
        int year = Integer.parseInt(shortDate.substring(0, 4));
        int month = Integer.parseInt(shortDate.substring(5, 7));
        int day = Integer.parseInt(shortDate.substring(8));

        String monthName = getMonthName(month);


        System.out.println("Full date representation: " + monthName + " " + day + ", " + year);

        scanner.close();
    }

   
    private static String getMonthName(int month) {
        String[] monthNames = new DateFormatSymbols().getMonths();
        return monthNames[month - 1];
    }
}
