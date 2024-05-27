package main.java.arrayBasicMethd;

class DuplicateNumber {
    public static void main(String[] args) {
        int arr[] = {1,5,5,3,4,2};
        System.out.println(findDuplicate(arr));
    }
    public static int findDuplicate(int[] nums) {

        for(int i = 0; i<nums.length-1;i++){
            int num = nums[i];
            for(int j = i+1; j<nums.length;j++){
                if(nums[j]==num){
                    return num;
                }
            }
        }
        return 0;
    }
}