package main.java.prianka.p2iteration;

public class ExponentialPower {
    public static void main(String[] args) {
        int n = 5;
        int p = 4;
        int ans = 1;
        for (int i=0;i<p;i++){
            ans = ans * n;
            System.out.println("Loot cycle = ");
            System.out.println("Ans = "+ans);
        }
        System.out.println(ans);
    }
}
