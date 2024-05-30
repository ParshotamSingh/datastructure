package main.java.matrix;

public class MaxRowOnes {
    static int getMaxRow(int[][] mat) {
        int count = 0;
        int sum = 0;
        int row = 0;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++){

                if(mat[i][j]==1){
                    count++;
                }

            }

            if(count>=sum){
                sum = count;
                row = i;
            }
            count = 0;
        }

        return row+1;
    }

    // Driver code
    public static void main(String[] args) {
        int mat[][] = {{0, 1, 1, 1},
                {0, 0, 1, 1},
                {1, 1, 1, 0},
                {0, 0, 0, 0}};

        // Function call
        System.out.println(getMaxRow(mat));
    }
}
