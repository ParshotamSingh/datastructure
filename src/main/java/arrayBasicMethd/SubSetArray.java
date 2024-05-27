package main.java.arrayBasicMethd;

public class SubSetArray {
    public static void main(String[] args) {

        int a1[] = {11, 7, 1, 13, 21, 3, 7, 3};
        int a2[] = {11, 3, 7, 1, 7};
        System.out.println(isSubSetArray(a1,a2));

    }
    public static boolean isSubSetArray(int a1[], int a2[]){
        int count = 0;
        for(int i=0;i<a1.length;i++){
            for(int j=0;j<a2.length;j++){
              if(a2[j]==a1[i]) {
                  count++;
              }
          }
        }
        if(count<a2.length){
            return false;
        }
        return true;
    }
}
