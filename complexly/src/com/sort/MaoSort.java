package com.sort;

public class MaoSort {


    // 冒泡排序
    private static void sort(int[] data) {
        int len = data.length;

        for(int i =0 ; i<len;i++){
            for(int j=1;j<len-i;j++){
                if(data[j-1]>data[j]){
                    int tep = data[j-1];
                    data[j-1] = data[j];
                    data[j] = tep;
                }
            }
        }


    }


    public static void main(String[] args) {
        int data[] = {6, 5, 3, 4, 1, 2};
        sort(data);
        for (int i : data) {
            System.out.print(i + "-");
        }

    }


}
