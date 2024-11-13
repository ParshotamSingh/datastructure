package main.java.prianka.p3array;

public class Median {
    public static void main(String[] args) {
        int a[] = {2,3,4,6,7,8};
        int median = 0;
        if (a.length % 2 != 0) {
            median = a[((a.length+1) / 2)-1];
            System.out.println("MEDIAN : " + median);
        }
        else {
            median = (a[(a.length/2)-1] + a[((a.length/2)+1)-1] )/2;
            System.out.println("MEDIAN : " +median);
        }


        }


    }

