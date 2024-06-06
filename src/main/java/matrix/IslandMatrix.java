package main.java.matrix;

public class IslandMatrix {
    public static void main(String[] args) {
        int grid[][] = {
                {1, 1, 1, 1, 0},
                {1, 1, 0, 1, 0},
                {1, 1, 0, 0, 0},
                {0, 0, 0, 0, 0},
                {0, 1, 1, 1, 0}};
        System.out.println(getIsland(grid));

    }
    public static int getIsland(int a[][]){
        int count = 0;
     for(int i=0;i<a.length;i++){
         for (int j=0;j<a[0].length;j++){
             try {
                 if(a[i][j]==1){
                     if(checkIslland(i,j,a)){
                         count++;
                     }
                 }

             }catch (ArrayIndexOutOfBoundsException e){

             }
         }
     }
        return count;
    }
    private static boolean checkIslland(int i, int j,int[][]  a){
        boolean right;
        boolean left;
        boolean up;
        boolean down;

        try {
            if(a[i+1][j]==0||i==a.length-1){
                down = true;
            }else {
                down = false;
            }
        }catch (ArrayIndexOutOfBoundsException e){
            down = true;
        }
        try{
        if(a[i-1][j]==0||i==0){
            up = true;
        }else {
            up = false;
        }
        }catch (ArrayIndexOutOfBoundsException e){
            up = true;
        }
        try{
        if(a[i][j+1]==0||j==a.length-1){
            right = true;
        }else {
            right = false;
        }
        }catch (ArrayIndexOutOfBoundsException e){
            right = true;
        }
        try{
        if(a[i][j-1]==0||j==0){
            left = true;
        }else {
            left = false;
        }
        }catch (ArrayIndexOutOfBoundsException e){
            left = true;
        }


        if(right && left && up && down){
            return true;
        }else {
            return false;
        }

    }

}
