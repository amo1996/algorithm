package com.sort;







public class InsertSort {

//  插入排序法
private static int[] sort(int[] data) {
    int len = data.length;

    for(int i =1;i<len;i++){
        for(int j=i;j>0;j--) {
            if (data[j] < data[j - 1]) {
                // swap
                int tep = data[j];
                data[j] = data[j-1];
                data[j-1] = tep;
            }
        }
    }

    return data;
}


    public static void main(String[] args) {
        int data[] = {6, 5, 3, 4, 1, 2};
        int[] sort = sort(data);
        for (int i : sort) {
            System.out.print(i + ">");
        }

    }



}
