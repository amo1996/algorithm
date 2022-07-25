package com.array;





public class MoveZero {

    public static void main(String[] args) {
         int[]  data = {1,0,3,12,0};
         new MoveZero().moveZeroes(data);
        for (int i :
             data) {
            System.out.println(i+"-");
        }
    }

    public void moveZeroes(int[] nums) {
        int j = 0;
        for (int i = 0; i<nums.length;i++){
            if(nums[i]!=0){
                // 往前移
                nums[j] = nums[i];
                j++;
            }
            if(i==nums.length-1){
                for(;j<nums.length;j++){
                    nums[j]=0;
                }
            }
        }
    }

}
