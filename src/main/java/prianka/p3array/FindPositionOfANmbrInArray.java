package main.java.prianka.p3array;

public class FindPositionOfANmbrInArray {
    public static void main(String[] args) {


        int a[] = {1, 9,15,32, 3, 4, 5, 6};
        int k = 1;
        int p = 0;
        boolean f = true;
        for (int i = 0; i < a.length; i++){
        if (a[i]==k){
            f = false;
            p = i;
            break;
        }
//        else {
//
//            }
        }
        if (f){
            System.out.println(k+"is not present in array");
        }else {
            System.out.println(k+" is at "+(p+1)+"th Position in array");
        }



    }
}