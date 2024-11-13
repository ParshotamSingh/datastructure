package main.java.prianka.p2iteration;

public class SumOfNaturalNumbers {
    public static void main(String[] args) {
//    int a = 1;
//    int sum = 0;
//    int j = 1;
//    for(a=1; a<100; a++){
//        sum = sum + a;
//    }
//    System.out.println("sum of first " +a+" numbers is = "+sum);
    int n=1;
    int sumofdigits = 0;

    for(n=1;n<101;n++){
        sumofdigits = n*(n+1);

    }
    System.out.println("Sum of first " +n+ " digits = "+ sumofdigits);
    }
}
