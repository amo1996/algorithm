package com.lz.array;

import java.util.Arrays;

public class LeetCodeSortArray {

    /**
     * 给定一个按非递减顺序排序的整数数组 A，
     * 返回每个数字的平方组成的新数组，要求也按非递减顺序排序。
     *  输入：[-4,-1,0,3,10]
     *  输出：[0,1,9,16,100]
     */

    public static int[] sortedSquares(int[] a) {
         for(int i=0;i<a.length;i++){
             a[i]=a[i]*a[i];
         }
         for(int i=0;i<a.length;i++){
             for(int j=0;j<a.length-i-1;j++){
                 if(a[j]>a[j+1]){
                     int tem=a[j];
                     a[j]=a[j+1];
                     a[j+1]=tem;
                 }
             }
         }
        return a;
    }
    public static int[] sortedSquares2(int[] a) {
        //为什么重新定义一个数组会比直接使用参数速度快?
        for(int i=0;i<a.length;i++){
            a[i]=a[i]*a[i];
        }
        Arrays.sort(a);
        return a;
    }
    public static void main(String[] args) {
            int[] a={-4,-1,0,3,10};
        int[] ints = sortedSquares2(a);
          for (int i=0;i<ints.length;i++){
              System.out.print(ints[i]+",");

          }
    }
}
