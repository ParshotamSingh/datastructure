package main.java.prianka.p2iteration;

public class OddEvenInFirst100 {
    public static void main(String[] args) {
        System.out.println("All Even numbers between 1 and 100");
        int x = 1;
        for(x=1; x<101; x++) {
            if (x % 2 == 0) {
                System.out.println(x);
            }
        }
    }
}
