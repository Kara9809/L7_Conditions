import java.util.Scanner;

public class ex9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please insert year");
        int year = scanner.nextInt();
        System.out.println("Please insert month");
        int month = scanner.nextInt();
        System.out.println("year : "+year);
        System.out.println("month : "+month);
        if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
            System.out.println("31 days");
        } else if (month == 4 || month == 6 || month == 9 || month == 11) {
            System.out.println("30 days");
        } else if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println("29 days");
        } else {
            System.out.println("28 days");

        }
        scanner.close();
    }
}
