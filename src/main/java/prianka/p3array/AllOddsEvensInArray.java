package main.java.prianka.p3array;

public class AllOddsEvensInArray {
    public static void main(String[] args) {
        int a[] = {4,7,8,6,9,3};
        for (int i=0;i<=a.length; i++){
        if ( a[i] % 2 == 0) {
            System.out.println( a[i]+" is even no.");
        }
        else {
            System.out.println(a[i]+" is odd no.");
        }
        }

    }
}
