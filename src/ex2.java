public class ex2 {
    public static void main(String[] args) {
        int num = (int) (Math.random() * 101);
        System.out.println("num : " + num);
        if (num > 50) {
            System.out.println("big");
        } else if (num < 50) {
            System.out.println("small");
        } else {
            System.out.println("Bingo!");

        }
    }
    }

