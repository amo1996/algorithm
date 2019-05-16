package com.lz.array;


/**
 *
 */
public class SortArrayByOneOrTwoLeetCode {

    /**
     * 给定一个非负整数数组 A，返回一个由 A 的所有偶数元素组成的数组，后面跟 A 的所有奇数元素。
     你可以返回满足此条件的任何数组作为答案
     输入：[3,1,2,4]
     输出：[2,4,3,1]
     输出 [4,2,3,1]，[2,4,1,3] 和 [4,2,1,3] 也会被接受。
     */
    public static int[] sortArrayByParity(int[] a) {
             for(int i=0;i<a.length;i++){
                 for(int j=0;j<a.length-i-1;j++){
                     if(a[j+1]%2==0&&a[j]%2==1){
                         int tem=a[j];
                         a[j]=a[j+1];
                         a[j+1]=tem;
                     }
                 }
             }
          return a;
    }


    /**
     *     双指针法
     * 思路：题目要求偶数在前，奇数在后，那么我选择采取双指针的方法：
     左指针寻找奇数值，右指针寻找偶数值，当符合交换条件时，进行两数交换；
     否则指针继续左右运动，寻找符合条件的奇偶值。
     当两指针相遇时，结束循环。
     * @param A
     * @return
     */
    public int[] sortArrayByParity2(int[] A) {
        if(A == null || A.length == 1) {
            return A;
        }
        //左、右指针初始化
        int left = 0;
        int right = A.length - 1;
        int tem;
        while(left < right){
            //左指针对应奇数值，右指针对应偶数值，进行交换
            if((A[left] & 1) == 1 && (A[right] & 1) == 0){
                tem = A[left];
                A[left] = A[right];
                A[right] = tem;
            }else if((A[left] & 1) == 0){
                //左指针对应的是偶数值，符合题意，继续向右移动
                left++;
            }
            else if((A[right] & 1) == 1){
                //右指针对应的是奇数值，符合题意，继续向左移动
                right--;
            }
        }
        return A;
    }
    public static void main(String[] args) {
        int[] a={3,1,2,4};
        int[] ints = sortArrayByParity(a);
        for (int i=0;i<ints.length;i++){
            System.out.print(ints[i]+",");

        }
    }
}
