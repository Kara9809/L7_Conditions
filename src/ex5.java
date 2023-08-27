public class ex5 {
    public static void main(String[] args) {
        int sal = (int) (Math.random()*120_001);
        System.out.println("Sal : " + sal);
        double tax = 0;
        if (sal <= 23_000) {
            tax = sal * 0.1;
        } else if (sal <= 50_000) {
            tax = sal * 0.2;
        } else if (sal <= 100_000) {
            tax = sal * 0.3;
        } else {
            tax = sal * 0.4;
        }
        System.out.println("tax : "+ tax);
        System.out.println("net : "+ (sal - tax));
    }

}

