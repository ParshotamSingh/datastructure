package main.java.prianka.p4doubleloop;

public class Doubt {
    public static void main(String[] args) {
        int a[] = new int [10] ;
        a[0]=12;
        for(int i =1;i<=10;i++){
    for(int x = i; x <= 10; x++) {
                if (i == 1) {
                    System.out.print("8888");
                }else if (x == 6) {
                    System.out.print("5555");
                }
                else {
                    System.out.print("9999");
                }
            }
            System.out.println();
        }
    }}
