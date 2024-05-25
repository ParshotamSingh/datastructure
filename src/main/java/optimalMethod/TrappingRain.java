package main.java.optimalMethod;

public class TrappingRain {
    public static void main(String[] args) {

        int arr[] = {3,0,0,2,0,4,0,0,4};
        System.out.println(getTrappingRainWater(arr));

    }
    public static int getTrappingRainWater(int a[]){
        int highest  = a[0];
        int secondHighest = 0;
        int capacity = 0;
        int fixCapacity = 0;
        for(int i=0;i<a.length-1;i++){
            if(highest<a[i]){
                secondHighest = highest;
                highest = a[i];
                fixCapacity = capacity;
//                capacity = 0;
            }
            if((highest-a[i+1])>0){
                capacity = (highest - a[i + 1]) + capacity;
            }
        }
        return capacity;
    }
}
