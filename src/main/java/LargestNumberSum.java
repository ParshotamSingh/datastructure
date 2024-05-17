package main.java;

public class LargestNumberSum {
    public static void main(String[] args) {
        int a1[] = {1, 3, 8, -2, 6, -8, 5};
        int a2[] = {1,2,3,-2,5};
        int a3[] = {-1,-2,-3,-4};
        System.out.println(findLargestSum(a1));
        System.out.println(findLargestSum(a2));
        System.out.println(findLargestSum(a3));
    }
    public static int findLargestSum(int arr[]){
        int max = arr[0];
        int sum = 0;
        for(int i=0;i<arr.length-1;i++){
            for(int j=i;j<=arr.length-1;j++){
                sum = arr[j]+sum;
                if(max<=sum){
                    max = sum;
                }
            }
            sum = 0;
        }
        return max;
    }
}
