package main.java.arrayBasicMethd;

public class CountInversion {
    public static void main(String[] args) {
        int arr1[] =  {2, 4, 1, 3, 5};
        int arr2[] =  {2, 3, 4, 5, 6};
        System.out.println(getInversionCount(arr1));
        System.out.println(getInversionCount(arr2));

    }
    public static int getInversionCount(int arr[]){
        int count = 0;
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length-1;j++){
                if(arr[i]>arr[i+1]){
                    count++;
                }
            }
        }

        return count;

    }
}
