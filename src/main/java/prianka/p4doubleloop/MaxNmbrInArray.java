package main.java.prianka.p4doubleloop;

public class MaxNmbrInArray {
    public static void main(String[] args) {
        int a[] = {12, 2, 33, 4, 55, 2, 6};
        int max = a[0];
        for (int i = 1; i <= a.length; i++) {

            if (max < a[i]) {
                max = a[i];

            }


            System.out.println(max);


        }


    }
}




