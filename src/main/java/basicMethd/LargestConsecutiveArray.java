package main.java.basicMethd;

import java.util.Arrays;

public class LargestConsecutiveArray {
    public static void main(String[] args) {
        int[] arr1 = {2,6,1,9,4,5,3};
        int[] arr2 = {-1,-2,-3,-4};
        System.out.println(getLargestSum(arr1));
//        System.out.println(getLargestSum(arr2));

    }

    public static int getLargestSum(int[] arr){
        int temp = 0;
        int k = 0;
        int count = 0;
        int largestArray = 0;
        for(int i=1;i<arr.length;i++){
            for(int j=0;j<arr.length-i;j++ ){
                if(arr[j]>arr[j+1]){
                    temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
                k=j+1;
            }
            if(arr[k]==arr[k-1]){
                count++;
            }else {
                count = 0;
            }
            if(count>=largestArray){
                largestArray = count;
            }
        }
        return largestArray;
    }
}
