package com.lz.array;


/**
 *  @Author liZhi
 */
public class LzArray {
    //定义一个数组
    public int[] data;
     //定义数组长度
     private int n;
     //定义数组中实际个数
     private int count;

    public LzArray(int n) {
        this.data=new int[n];
        this.n = n;
        this.count=0;
    }

    //根据索引，找到数据中的元素并返回
     public int find(int index){
        //数组越界？
         if(index<0||index>n){
             return -1;
         }
         return data[index];
     }
     //删除
      public boolean delete(int index){
          //位置不合法
          if(index<0||index>n){
              System.out.println("删除的位置不合法");
              return false;
          }
         this.data[index]=0;
         --count;
          return true;
      }

    //增加
     public boolean  insert(int index,int value){
          //数组满了
          if(count==n){
              System.out.println("数组已满，没有可插入的位置!");
          }
          //数组没满，可以插入
          //位置不合法
          if(index<0||index>n){
              System.out.println("插入的位置不合法");
              return false;
          }
          this.data[index]=value;
          ++count;
          return true;
     }
    public static void print(LzArray array){
        for(int i=0;i<array.n;i++){
            System.out.println(array.find(i));
        }
    }

    public static void main(String[] args) {
        LzArray array = new LzArray(5);
        array.insert(0,1);
        array.insert(1,2);
        array.insert(2,3);
        array.insert(3,4);
        array.insert(4,5);
        print(array);
        int i = array.find(3);
        System.out.println(i);
        array.delete(2);
        print(array);
    }
}
