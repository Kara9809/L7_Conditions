public class ex3 {
    public static void main(String[] args) {
        int sal = (int) (Math.random()*1001)+5000;
        System.out.println("Sal : " + sal);
        if (sal *0.1 <= 6000) {
            System.out.println("sal : " + sal * 1.1);
        } else {
            System.out.println("sal : " + sal * 1.05);
        }
    }
}
