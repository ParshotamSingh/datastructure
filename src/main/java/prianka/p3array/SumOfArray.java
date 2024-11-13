package main.java.prianka.p3array;

public class SumOfArray    {
    public static void main(String[] args) {
        int a[]={2,3,1,4,16};
        int sum = 0;
        for(int i=0; i<a.length; i++){
            sum = sum + a[i];

        }
        System.out.println(sum);
    }
}
