package main.java.basicMethd;

public class SubSetArray {
    public static void main(String[] args) {

        int a1[] = {11, 7, 1, 13, 21, 3, 7, 3};
        int a2[] = {11, 3, 7, 1, 7};
        System.out.println(isSubSetArray(a1,a2));

    }
    public static boolean isSubSetArray(int a1[], int a2[]){
        boolean flag = false;
        for(int i=0;i<a1.length;i++){
            flag = false;
          for(int j=0;j<a2.length;j++){
              if(a2[j]==a1[i]) {
                  flag = true;
              }
          }
          if(!flag){
              return false;
          }
        }
        return flag;
    }
}
