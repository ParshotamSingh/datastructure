package main.java.arrayBasicMethd;

public class CountPairSum {
    public static void main(String[] args) {
        int arr1[] = {1, 5, 7, 1};
        int arr2[] = {1, 1, 1, 1};
        System.out.println(getMaxSumPair(arr1,6));
        System.out.println(getMaxSumPair(arr2,2));

    }
    public static int getMaxSumPair(int arr[], int k){
        int count = 0;
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length-1;j++){
                if(arr[i]+arr[j+1]==k){
                    count++;
                }
            }
        }
        return count;
    }
}
