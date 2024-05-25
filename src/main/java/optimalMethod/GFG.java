package main.java.optimalMethod;

class GFG {

    /* Return true if arr2[] is a subset
    of arr1[] */
    static boolean isSubset(int arr1[], int arr2[], int m,
                            int n) {
        int i = 0;
        int j = 0;
        for (i = 0; i < n; i++) {
            for (j = 0; j < m; j++)
                if (arr2[i] == arr1[j])
                    break;

            /* If the above inner loop
            was not broken at all then
            arr2[i] is not present in
            arr1[] */
            if (j == m)
                return false;
        }

        /* If we reach here then all
        elements of arr2[] are present
        in arr1[] */
        return true;
    }

    static void findIfArrayIsASubset(int[] main, int[] sub) {
        int count = 0;
        for (int i = 0; i < main.length; i++) {
            for (int j = 0; j < sub.length; j++) {
                if (main[i] == sub[j]) {
                    main[i] = -1;
                    count++;
                    break;
                }
            }
        }
        if (count == sub.length)
            System.out.println("is a subset");
        else
            System.out.println("is not a subset");
    }

    static boolean isSubset(int arr1[], int m, int arr2[], int n) {
        if (m > n) return false;
        for (int i = 0; i < m; i++) {
            boolean present = false;
            for (int j = 0; j < n; j++) {
                if (arr2[j] == arr1[i]) {
                    present = true;
                    break;
                }
            }
            if (present == false) return false;
        }
        return true;
    }

    // Driver code
    public static void main(String args[]) {
        int arr1[] = {11, 1, 13, 21, 3, 3, 7, 3};
        int arr2[] = {11, 3, 3, 7, 1, 1};

        int m = arr1.length;
        int n = arr2.length;

//        findIfArrayIsASubset(arr1, arr2);
        System.out.println(isSubset(arr1, arr2,m,n));


    }
}