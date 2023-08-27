import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please insert 1st number");
        int a = scanner.nextInt();
        System.out.println("Please insert 2nd number");
        int b = scanner.nextInt();
        System.out.println("Insert 3rd number");
        int c = scanner.nextInt();
        System.out.println("a : " + a);
        System.out.println("b : " + b);
        System.out.println("c : " + c);
        int sum = a + b + c;
        int max = Math.max(a, Math.max(b, c));
        System.out.println("Max : " + max);
        int min = Math.min(a, Math.min(b, c));
        System.out.println("Min power 3 : " + Math.pow((double)min, 3.0));
        System.out.println("Middle : " + (sum - max - min));
        scanner.close();
    }

    }

