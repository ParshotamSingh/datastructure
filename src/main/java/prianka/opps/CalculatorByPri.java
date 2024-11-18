package main.java.prianka.opps;

public class CalculatorByPri {
    public static void main(String[] args) {
//
        StandardCalByPri standardCall= new StandardCalByPri();
        int a = standardCall.plus(8,24);
        System.out.println(a);
        int b = standardCall.minus(25,6);
        System.out.println("subtraction: "+ b);
        int c = standardCall.multiply(5, 7);
        System.out.println("multiplication: "+ c);
        int d = standardCall.divide(125,5);
        System.out.println("division: "+ d);

        System.out.println();

        GeometricalCalByPri geometricalCall = new GeometricalCalByPri();
        int e = geometricalCall.areaofcircle(5);
        System.out.println("Area of circle: "+ e);
        int f = geometricalCall.diameterofcircle(6);
        System.out.println("Diameter of Circle: "+ f);
        int g = geometricalCall.areaofsquare(7);
        System.out.println("Area of Square: "+g);
        int h = geometricalCall.areaofrectangle(4,5);
        System.out.println("Area of Rectangle: "+ h);

        System.out.println();


        StatisticalCalByPri statisticalCall = new StatisticalCalByPri();
        int i = statisticalCall.meanofarr(5,6,7,2);
        System.out.println("Mean of Numbers: "+i);
        int[] arr = {1,2,3,4,5,6};
        float j = statisticalCall.medianofarr(arr);
        System.out.println("Median of Numbers: "+j);
    }


}
