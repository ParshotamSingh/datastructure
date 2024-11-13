package main.java.prianka.p1;

public class Operators {
    public static void main(String[] args) {
        int a = 786;
        int b = a%10;
        System.out.println("  b  = "+b);
//        qc is for quotient of 786/10 to be used for finding out remainder of 78/10 in further step
        int qc = a/10;
        int d = qc%10;
        System.out.println("  d  = "+d);
        int e = qc/10;
        System.out.println(" e = "+e);

        System.out.println("sum of digits = "+b+d+e);


//        Refine

        int digit = 786;
        int sumOfDigit = 0;
        sumOfDigit = digit%10;
        int q = a/10;
        sumOfDigit = q%10+sumOfDigit;
        sumOfDigit = q/10+sumOfDigit;

        System.out.println("Sum of digits = "+sumOfDigit);



    }
}
