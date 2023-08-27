public class ex1 {
    public static void main(String[] args) {
        int num = (int) (Math.random()*101);
        System.out.println("Num : "+num);
        if (num > 50) {
            System.out.println("Big");
        }
        if (num < 50) {
            System.out.println("Small");
        }
        if (num == 50) {
            System.out.println("Bingo");
        }

    }
}
