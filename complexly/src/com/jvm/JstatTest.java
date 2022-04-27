package com.jvm;

/**
 * @Classname JstatTest
 * @Description
 * @Date 2022/4/14 19:40
 * @Created by liZhi
 */
public class JstatTest {
    public static void main(String[] args) throws InterruptedException {
        Thread.sleep(30000);
        System.out.println("start");
        while(true){
            loadData();
        }
    }

    private  static  void  loadData() throws InterruptedException {
          byte[] data = null;
        //AgeToFull ageToFull = new AgeToFull();
         //ageToFull.abc="sssssssssssssssssssssss";
        for (int i=0;i<50;i++){
              data = new byte[100 * 1024];
          }
          data = null;
         Thread.sleep(1000);
    }

}
