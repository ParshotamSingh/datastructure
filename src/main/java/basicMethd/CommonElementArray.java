package main.java.basicMethd;

public class CommonElementArray {
    public static void main(String[] args) {
        int arr1[] = {100, 5, 10, 20, 40, 80};
        int arr2[] = {40, 7, 20, 80, 100};
        int arr3[] = {3, 40, 15, 20, 30, 70, 80, 120, 100};
        getCommonElement(arr1,arr2,arr3);
    }

    public static int getCommonElement(int arr1[], int arr2[], int arr3[]){

        for(int i=0; i<arr2.length;i++){
            for(int j=0;j<arr1.length;j++){
                if(arr2[i]==arr1[j]){
                    for(int k=0;k<arr3.length;k++){
                        if(arr3[k]==arr1[j])
                        {
                            System.out.println(arr3[k]);
                        }
                    }
                }
            }
        }
        return 0;
    }
}
