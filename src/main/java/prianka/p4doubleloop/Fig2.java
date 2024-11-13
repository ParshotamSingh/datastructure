package main.java.prianka.p4doubleloop;

public class Fig2 {
    public static void main(String[] args) {
        for(int i = 0;i<10;i++){

            for(int j = i;j<10;j++){
                System.out.print(" ");
            }

            for(int j = 1;j<=i;j++){
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
