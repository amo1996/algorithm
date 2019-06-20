package com.found;

/**
 * @Classname BinarySearch
 * @Description  二分查找
 * @Date   2019年6月20日15:29:43
 * @Created by liZhi
 */
public class BinarySearch {

    /**
     *  二分查找： 即每次都通过跟区间中的中间元素对比，将待查找的区间缩小为一半，直到找到要查找的元素。或者区间缩小到0。
     *
     * 二分查找的局限性：
     *  1、 二分查找依赖的是顺序表结构，简单点说就是数组。
     *   而且二分查找不能依赖链表等数据结构，因为二分查找算法需要按照下标随机访问元素。
     *   所以，如果数据使用链表存储，二分查找的时间复杂度就会变的很高、
     *  2、而且二分查找针对的是有序数据。如果数据没有序，我们需要先排序。
     *  3、数据量太小不适合二分查找，数据量太小直接遍历即可。
     *  4、数据量太大也不适合二分查找，二分查找的底层依赖数据这种数据结构，
     *    而数组为了支持随机访问的特性，要求内存空间连续，对内存的要求比较苛刻。
     *    要注意这里是 连续的内存空间， 比如说我们现在有1GB的数据，就算你有2GB的内存剩余空间，
     *    但是不是连续的。那照样无法申请一个1个1GB的内存空间。
     *
     *
     *
     */


    /**
     * 非递归实现二分查找
     *  有序数组中不存在重复元素
     */
    public int bsearch(int[] a,int n,int value ){
        int low=0;       //当前查找的区间下限
        int high=n-1;    //当前查找的区间上限

        while (low<=high){
            // int mid=low+(high-low)/2;  //防止low+high 和过大 溢出 int范围
            // int mid=low+((high-low)>>1);  //极致性能  因为计算机处理位运算符很快
            int mid=(low+high)/2;   //中间位置
            if(a[mid]==value){
                return mid;
            }else if(a[mid]<value){
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        return -1;
    }

    public int search(int[] a,int n,int value){
        return searchInternally(a,0,n-1,value);
    }

    /**
     *    二分查找递归版本
     * @param a   待查找的数组
     * @param low 开始索引
     * @param high 结束索引
     * @param value 要搜索的值
     * @return
     */
    private int searchInternally(int[] a, int low, int high, int value) {
         if(low>=high) return -1;

         int mid=low+((high-low)>>1);
         if(a[mid]==value){
             return mid;
         }else if(a[mid]<value){
             return  searchInternally(a,mid+1,high,value);
         }else{
             return  searchInternally(a,low,mid-1,value);
         }

    }

}
