package main.java.basicMethd;

public class MergeIntervals {
    public static void main(String[] args) {
        int[][] arr = {{1,3},{2,6},{8,10},{15,18}, {26,50}};
        getMergeInterval(arr);
    }
    public static int[][] getMergeInterval(int[][] arr){
        boolean flag = false;
        for(int i=0;i<arr.length;i++) {
            int num = arr[i][1];
            if (flag) {
                flag = false;
                continue;
            }
            for (int j = 0; j < arr[0].length; j++) {
                if (i != arr.length-1) {
                    if (num > arr[i + 1][0]) {
                        flag = true;
                    }
                }
                System.out.print(arr[i][j] + " ");
                if (i == arr.length - 2 && !flag) {
                }
            }
            System.out.println("");
        }
        return null;
    }
}
