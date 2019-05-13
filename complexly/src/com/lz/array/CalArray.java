package com.lz.array;

/**
 * 2019年5月10日13:41:40
 * @author liZhi
 *  数组  平均情况时间复杂度为O(n)
 */
public class CalArray {

    /**  问题：
     *  0、 为什么数组下标是从0开始，而不是更符合人类习惯从1开始呢？
     *
     *   数组：数组是一种线性表数据结构。它用一组连续的内存空间，来存储一组具有相同类型的数据。
     *   1): 线性表：就是数据排成像一条线的结构，每个线性表上的数据最多只有前和后两个方向。队列，链表，栈也是线性表结构。
     *   2): 连续的内存空间和相同类型的数据：正是因为这两个条件，所以数组可以随机访问。但是这两个限制也让数组的一些操作（删除，插入）变的低效。
     *       为了保证连续的内存空间，删除和插入数据就得移动大量数据。
     *   3): 根据下标进行随机访问：因为内存是连续的，数组中每个元素的内存大小区间是固定的，就可以根据寻址公式：
     *    a[i]_address=base_address+i*data_type_size   就是首地址加上多少个元素大小
     *    排序后的数组，通过二分法查找元素，时间复杂度是O(logn).
     *    只有根据下标随机访问的时间复杂度是O(1)
     *    ArrayList最大的优势就是将数组操作的细节封装了起来：
     *    什么时候使用数组还是使用ArrayList：
     *    1): ArrayList无法存储基本类型，比如int long 需要封装，而装箱拆箱有一定的性能消耗，如果特别关注性能，就可以选用数组。
     *    2): 如果数据大小事先已知，并且操作非常简单，也可以直接使用数组
     *    3): 当需要表示多维数组时，用数组往往更加直观。Object[][] array  如果用ArrayList的话  ArrayList<ArrayList> array
     *
     *   0、 为什么数组下标是从0开始，而不是更符合人类习惯从1开始呢？
     *   下标为0开始：
     *    a[i]_address=base_address+i*type_size
     *    下标为1开始：
     *    a[i]_address=base_address+(i-1)*type_size
     *    对比可以发现：从1开始的话，多了一次减法运算，对于CPU来说，就是多了一次减法指令。
     *   还有个原因：C语言设计者用0开始计数数组下标，之后的高级语言都效仿了C语言。
     */
    public static void print(int[] a){
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }

    public static void main(String[] args) {
        int[] a=new int[10];
          a[2]=10;
        print(a);
    }

}
