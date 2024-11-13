package main.java.prianka.p3array;

public class ArrayDemo {
    public static void main(String[] args) {
    //define an array
        int a[] = {1,2,3,4,5,6,7,8,9};
        //array position number starts from 0
        // print 6th value of an array
        System.out.println(a[6]);

        //traverse ie print all elements in array
        for(int i = 0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }
}
