package main.java.matrix;

public class SpiralTraverse {
    public static void main(String[] args) {
        int matrix[][] = {{1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15,16}};
      get(matrix);
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
        int turn = 1;
        int outputArray[] = new int[mSize];
        for(int i=0;i<x;i++){
            if(turn==1){
                for(int j=pointA;j<pointB;j++){
                System.out.print(" "+a[pointA][j]);
                }
                turn++;
            }
            if(turn==2){
                for(int j=1;j<pointC;j++){
                    System.out.print(" "+a[j][pointB-1]);
                }
                turn++;
            }
            if(turn==3){
                for(int j=pointC-2;j>pointD;j--){
                    System.out.print(" "+a[pointC-1][j]);
                }
                turn++;
            }
            if(turn==4){
                for(int j=pointB-1;j>=pointD;j--){
                    System.out.print(" "+a[j][pointA]);
                }
                pointA++;
                turn = 1;
            }
            System.out.println();
        }
        return null;
    }
}
