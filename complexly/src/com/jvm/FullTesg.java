package com.jvm;

/**
 * @Classname FullTesg
 * @Description
 * @Date 2022/4/14 14:16
 * @Created by liZhi
 */
public class FullTesg {

    public static void main(String[] args) {

        /**      新生代10MB        堆内存 20MB  晋升年龄15  10MB 大对象进入老年代  Eden 8MB   s1 1MB
         “-XX:NewSize=10485760 -XX:MaxNewSize=10485760 -XX:InitialHeapSize=20971520 -XX:MaxHeapSize=20971520 -
         XX:SurvivorRatio=8 -XX:MaxTenuringThreshold=15 -XX:PretenureSizeThreshold=10485760 -XX:+UseParNewGC -
         XX:+UseConcMarkSweepGC -XX:+PrintGCDetails -XX:+PrintGCTimeStamps -Xloggc:gc.log”
         */
        byte[] array1 = new byte[2 * 1024 * 1024];  // 2MB
        array1 =new byte[2*1024*1024];        // 2MB
        array1 =new byte[2*1024*1024];         // 2MB
        array1 = null;

        byte[] array2 = new byte[128 * 1024];     // 128KB
        byte[] array3 = new byte[1024 * 1024*2];     //2 MB
        array3 = new byte[1024 * 1024*2];
        array3 = new byte[1024 * 1024*2];
          array3 = null ;

        byte[] array4 = new byte[1024 * 1024*2];     //2 MB
    }
}
