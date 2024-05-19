package main.java.basicMethd;

public class KadaneAlgo {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,-2,5};
        int[] arr2 = {-1,-2,-3,-4};
        int[] arr3 = {4,-1,2,-7, 3, 4};
        int[] arr4 = {-2,1,-3,4, -1, 2, 1, -5, 4};
        System.out.println(getLargestSum(arr1));
        System.out.println(getLargestSum(arr2));
        System.out.println(getLargestSum(arr3));
        System.out.println(getLargestSum(arr4));
    }

    public static int getLargestSum(int[] arr){
        int sum = 0;
        int largestSum = arr[0];
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++ ){
                sum = arr[j]+sum;
                if(largestSum<=sum){
                    largestSum = sum;
                }
            }
            sum = 0;
        }
        return largestSum;
    }
}
