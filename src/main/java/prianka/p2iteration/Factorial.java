package main.java.prianka.p2iteration;

public class Factorial {
    public static void main(String[] args) {
        System.out.println("Print Factorial Value");
        //ask


        int num = 4;
        int fact = 1;
        int x = 1;
        for (x=2; x<=num; x++){
            fact = fact * x;
        }
        System.out.println("Factorial: " + fact);
    }

}
