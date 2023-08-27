import java.util.Scanner;

public class ex10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please insert Your age");
        float age = scanner.nextFloat();
        System.out.println((age>21)?"authorize":"unauthorized");
        scanner.close();
    }
}
