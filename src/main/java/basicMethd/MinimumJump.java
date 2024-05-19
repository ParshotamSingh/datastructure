package main.java.basicMethd;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;

public class MinimumJump {
    public static void main(String args[]){
        int arr1[] = {1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9};
        int arr2[] = {1, 4, 3, 2, 6, 7};
        System.out.println(findMinimumJump(arr1));
        System.out.println(findMinimumJump(arr2));
    }

    public static int findMinimumJump(int arr[]){

        int arrLength = arr.length;
        int sum = 0;

        for(int i=0; i<arrLength-1;i++) {
            sum = arr[i] + sum;
            if (sum >= arrLength) {
                return i;
            }
        }
        return 0;
    }
    public static int findMinimumJumpWithStream(int arr[]){
        int sum = 0;
        int arrLength = arr.length;
        for(int i : arr){
            sum = arr[i] + sum;
            if (sum >= arrLength) {
                return i;
            }
        }
        return 0;
    }

}
