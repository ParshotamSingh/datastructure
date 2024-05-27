package main.java.arrayBasicMethd;

public class LargestConsecutiveArray {
    public static void main(String[] args) {
        int[] arr1 = {18,2,15,6,12,1,19,91,13,4,5,14,3,16,17};
        int[] arr2 = {12,6,1,9,4,5,3};
        System.out.println(getLargestSum(arr1));
        System.out.println(getLargestSum(arr2));

    }

    public static int getLargestSum(int[] arr){
        int temp = 0;
        int k = arr.length-2;
        boolean flag = false;
        int count = 0;
        int largestArray = 0;
        for(int i=1;i<arr.length+1;i++){
            for(int j=0;j<arr.length-i;j++ ){
                if(arr[j]>arr[j+1]){
                    temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
            if(flag){
                if(arr[k]+1==arr[k+1]){
                    count++;
                }else {
                    count = 0;
                }
            if(count>=largestArray){
                largestArray = count;
            }
            k--;
            }
            flag = true;
        }
        return largestArray+1;
    }
}
