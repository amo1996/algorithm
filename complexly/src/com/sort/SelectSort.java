package com.sort;


public class SelectSort {

    // 原地选择排序   时间复杂度O(n^2)

    private static int[] sort(int[] data) {
        int len = data.length;

        for (int i = 0; i < len; i++) {

            int minindex = i;
            for (int j = i + 1; j < len; j++) {
                if (data[j] < data[minindex]) {
                    minindex = j;
                }

            }
            // 交换索引
            if (minindex != i) {
                int tep = data[i];
                data[i] = data[minindex];
                data[minindex] = tep;
            }
        }


        return data;
    }


    public static void main(String[] args) {
        int data[] = {6, 5, 3, 4, 1, 2};
        int[] sort = sort(data);
        for (int i : sort) {
            System.out.print(i + "-");
        }

    }


}
