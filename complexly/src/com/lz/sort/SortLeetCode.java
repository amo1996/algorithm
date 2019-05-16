package com.lz.sort;



public class SortLeetCode {
    /**
     * 原地排序:特指空间复杂度是O(1)的排序算法
     * @param a
     * @return
     */
    /**
     * 冒泡排序  bubbleSort
     * @param a
     * @return
     */
    public static int[] bubbleSort(int[] a){
        if(a.length<1) {
            return null;
        }
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length-i-1;j++){
                if(a[j]>a[j+1]){
                    int tem=0;
                    tem=a[j];
                    a[j]=a[j+1];
                    a[j+1]=tem;
                }

            }

        }
        return a;
    }

    /**
     * 插入排序
     * @param a
     * @return
     */
    public static int[] insertSort(int[] a){
           int n=a.length;
           for(int i=1;i<n;i++){
               int value=a[i];
               int j=i-1;
               for(;j>=0;j--){
                   if(a[j]>value){
                       a[j+1]=a[j];
                   }else{
                       break;
                   }
               }
               a[j+1]=value;
           }

        return a;
    }

    public static void main(String[] args) {
            int[] a={1,3,2,6,4};
     //   int[] ints = bubbleSort(a);
        int[] ints = insertSort(a);
        for(int i:ints){
            System.out.print(i+",");
        }
    }
}
