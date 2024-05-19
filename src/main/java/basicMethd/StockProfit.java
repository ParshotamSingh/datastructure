package main.java.basicMethd;

public class StockProfit {
    public static void main(String[] args) {
        int arr1[] = {7,1,5,3,6,4};
        int arr2[] = {7,6,4,3,1};
        System.out.println(getProfit(arr1));
        System.out.println(getProfit(arr2));
    }

    public static int getProfit(int arr[]){
        int buy = 0;
        int profit =0;
        int temp = 0;
        for(int i=0;i<arr.length-1;i++){
            buy = arr[i];
            for(int j=i;j<arr.length;j++){
                temp = arr[j]-buy;
                if(profit<temp){
                    profit=temp;
                }
            }
        }
        return profit;
    }
}
