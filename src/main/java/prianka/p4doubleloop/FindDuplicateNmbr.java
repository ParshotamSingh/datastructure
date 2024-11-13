package main.java.prianka.p4doubleloop;

public class FindDuplicateNmbr {
    public static void main(String[] args) {
        int a[] = {0, 1, 20, 1,20, 3,15,3,4};
        int l = a.length;
        int f = a[0];
        for (int i =0; i <= l - 1; i++) {
            for (int j =i+1; j <= l - 1; j++) {
                if (a[i] == a[j]) {
                    System.out.println("repetitive no. is = " + a[i]);
                }

            }
        }
    }
}

