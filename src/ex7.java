import java.util.Scanner;

public class ex7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please insert Year");
        int year = scanner.nextInt();
        System.out.println("Year : "+year);
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println("Leap Year");
        } else {
            System.out.println("Regular Year");
        }

        scanner.close();
    }
}


