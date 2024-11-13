package main.java.prianka.p2iteration;

public class WhileReverseOfANumber {
    public static void main(String[] args) {
//int a =456;
//int b = a%10; int c = a/10;
//int e = b%10; int f = c%10; int g = c/10;
//        System.out.println((e*100)+(f*10)+g);

        int num = 152034;
        int result = 0;
        while (num!=0)
        {
            result = (result*10) + (num%10);
            num = num/10;

        }
        System.out.println(result);
    }
}
