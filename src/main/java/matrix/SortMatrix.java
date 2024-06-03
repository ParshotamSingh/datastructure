package main.java.matrix;

public class SortMatrix {
    public static void main(String[] args) {
        int a[][]={{100,20,30,40},
                {15,255,35,45},
                {27,29,37,48},
                {32,33,39,50}};
        printMatrix(getSortedMatrix(a));
    }
    public static int[][] getSortedMatrix(int a[][]){
        int temp = 0;
        int n =  a.length;
        int m = a[0].length;
        for(int k=0;k<n*m;k++){
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m-1; j++){
                    if(a[i][j]>a[i][j+1]){
                        temp = a[i][j];
                        a[i][j]=a[i][j+1];
                        a[i][j+1]=temp;
                    }
                }

                if(i<n-1){
                    if(a[i][m-1]>a[i+1][0]){
                        temp = a[i][m-1];
                        a[i][m-1]=a[i+1][0];
                        a[i+1][0]=temp;
                    }
                }
            }
        }
        return a;
    }
    public static void printMatrix(int a[][]){
        int temp = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                System.out.print(" " + a[i][j]);
            }
            System.out.println();
        }
    }
}
