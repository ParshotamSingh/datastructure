package main.java.matrix;

public class SpiralTraverse {
    public static void main(String[] args) {
        int matrix[][] = {{1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15,16}};
        System.out.println(get(matrix));
    }
    public static int[] get(int a[][])
    {
        int x = a.length;
        int y = a[0].length;
//        int pointA[] = {0,0};
//        int pointB[] = {0,x-1};
//        int pointC[] = {x-1,y-1};
//        int pointD[] = {x-1,0};
        int pointA = 0;
        int pointB = x;
        int pointC = x;
        int pointD = 0;
        int mSize = x * y;
        int turn = 0;
        int outputArray[] = new int[mSize];
        for(int i=0;i<x;i++){
            turn++;
            if(turn==1){
                for(int j=pointA;j<pointB;j++){
                System.out.println(a[pointA][j]);
                }
            }
            if(turn==2){
                for(int j=0;j<pointC;j++){
                    System.out.println(a[j][pointB-1]);
                }
            }
            if(turn==3){
                for(int j=pointC-1;j>=pointD;j--){
                    System.out.println(a[pointC-1][j]);
                }
            }
            if(turn==4){
                for(int j=pointB-1;j>=pointD;j--){
                    System.out.println(a[j][pointA]);
                }
            }
        }
        return null;
    }
}
