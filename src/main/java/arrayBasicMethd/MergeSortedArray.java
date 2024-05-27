package main.java.arrayBasicMethd;
import java.util.Arrays;
public class MergeSortedArray {
    public static void main(String args[]){
        int array1[] = {1, 3, 4, 5};
        int array2[] = {2, 4, 6, 8, 9, 10, 11, 12, 23, 23};
        System.out.println(Arrays.toString(mergeSortedArray(array2,array1)));
    }
    public static int[] mergeSortedArray(int arr1[], int arr2[]){
        int num1 = 0;
        int num2 = 0;
        int count = 0;
        int bigArrayLength;
        int smallArrayLength;
        if(arr1.length<=arr2.length) {
            bigArrayLength =arr2.length;
            smallArrayLength = arr1.length;
        }else {
            bigArrayLength = arr1.length;
            smallArrayLength = arr2.length;
        }

        int mergedArray[] = new int[arr1.length+arr2.length];
        for(int i=0; i<bigArrayLength;i++){
            if((arr1.length<=arr2.length)&&i>=smallArrayLength){

                mergedArray[count]= arr2[i];
                count++;

            }else if((arr2.length<=arr1.length)&&i>=smallArrayLength){

                mergedArray[count]= arr1[i];
                count++;


            }else {
            if(arr1[i]<=arr2[i]){
                num1 = arr1[i];
                num2 = arr2[i];
            }else if(arr1[i]>=arr2[i]){
                num2 = arr1[i];
                num1 = arr2[i];
            }
            mergedArray[count] = num1;
            mergedArray[count+1] =num2;
            count = count+2;
        }}
        return mergedArray;

    }
}
