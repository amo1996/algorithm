package com.array;


public class MoveZero {

    public static void main(String[] args) {
        int[] data = {1, 0, 3, 12, 0};
        new MoveZero().moveZeroesTwo(data);
        for (int i :
                data) {
            System.out.println(i + "-");
        }
    }

    public void moveZeroes(int[] nums) {
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                // 往前移
                nums[j] = nums[i];
                j++;
            }
            if (i == nums.length - 1) {
                for (; j < nums.length; j++) {
                    nums[j] = 0;
                }
            }
        }
    }

    public void moveZeroesTwo(int[] nums) {
        // 交换0  和 非 0
        int j = 0;  //记录交换后的前索引

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                // 交换该元素和 j
                int tep = nums[j];
                nums[j] = nums[i];
                nums[i] = tep;
                j++;
            }
        }


    }

}
