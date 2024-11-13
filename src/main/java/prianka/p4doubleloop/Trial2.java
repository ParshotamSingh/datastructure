package main.java.prianka.p4doubleloop;

public class Trial2 {
    public static void main(String[] args) {
        for(int i = 0; i<11;i++){
            for (int j= 0 ;j<i;j++){
                System.out.print(" ");
            }
            for(int k =0;k<i;k++) {
                System.out.print("*");
            }
            for(int l =0;l<i;l++) {
                System.out.print(" ");
            }
            for(int m =0;m<i;m++) {
                System.out.print("#");
            }
            System.out.println();
        }
    }
}
