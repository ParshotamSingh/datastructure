package main.java.prianka.opps;

public class StatisticalCalByPri {
    public int meanofarr(int var1, int var2, int var3, int var4) {
        int arr[] = {var1, var2, var3, var4};
        int len = arr.length;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        int mean = sum / len;
        return mean;
    }


    public float medianofarr(int [] arr){
        int len=arr.length;
        float median = 0;
        if (arr.length % 2 != 0) {
            median = arr[((len+1) / 2)- 1];
            }
        // -1 is written to adjust array position with mathematical formula
        else {
            float h = arr[(len/2)-1] + arr[((len/2)+1-1)];
            median=h/2;
            }

        return  median;

    }

}




