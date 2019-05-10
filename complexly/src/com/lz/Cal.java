package com.lz;

public class Cal {

    public static int cal(int n){
        int sum=0;
        int i=1;
        for(;i<=n;++i){
            sum=sum+i;
        }
        return sum;
    }
    public static int cal2(int n){
        int sum=0;
        int i=1;
        for(;i<=n;i++){
            sum=sum+i;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(cal(10));
        System.out.println(cal2(10));
    }
}
