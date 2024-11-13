package main.java.prianka.p4doubleloop;

public class Trial4 {
    public static void main(String[] args) {
        for(int i=1;i<=10;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            for(int k =1;k<=10; k++){
                System.out.print("#");
            }
            for(int l = i ; l<=10;l++){
                System.out.print("*");
            }
            for(int m=1; m<2;m++){
                System.out.print(" ");
            }
            for(int n=i;n<=10;n++){
                System.out.print(" ");
            }
            System.out.print("**");
            for(int o=1;o<=i;o++) {
                if (i != 6) {
                    System.out.print(".");}
                else {
                    System.out.print(",");
                }
            }
//            for(int p=1;p<=i;p++){
//                if(i!=6){
//                    System.out.print(" ");}
//            else{
//                    System.out.print("*");}
//            }
//
//            System.out.print("**");
//
//            for(int q=i;q<=1;q++){
//                System.out.print(".");
//            }
//            for(int r=1;r<=i;r++){
//                System.out.print("&");
//            }
        }
    }
}
