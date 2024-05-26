package main.java.optimalMethod;

public class TrappingRain {
    public static void main(String[] args) {

        int arr1[] = {3,0,0,2,0,4,0,0,4};
        int arr2[] = {8,3,6,0,7,0,5,0,3};
        System.out.println(getTrappingRainWater(arr2));

    }
    public static int getTrappingRainWater(int a[]){

        int capacity = 0;
        int fixCapacity = 0;
        for(int i=0;i<a.length-1;i++){
            int bigP  = 0;
            int biggestP = 0;
            int midP = 0;
            int smallP = 0;
            if(a[i]<a[i+2]){
                bigP = a[i+2];
                smallP = a[i];
                midP = a[i+1];
            }else {
                bigP = a[i];
                smallP = a[i+2];
                midP = a[i+1];
            }
            if(biggestP<bigP){
                biggestP = bigP;
            }
            capacity = smallP - midP + capacity;
        }
        return capacity;
    }
}
