package com.lz.array;

public class ArrayLeetcode {

    /**
     * 给定一个二进制矩阵 A，我们想先水平翻转图像，然后反转图像并返回结果。
     * 水平翻转图片就是将图片的每一行都进行翻转，即逆序。例如，水平翻转 [1, 1, 0] 的结果是 [0, 1, 1]。
     * 反转图片的意思是图片中的 0 全部被 1 替换， 1 全部被 0 替换。例如，反转 [0, 1, 1] 的结果是 [1, 0, 0]
     */
    public static int[][] flipAndInvertImage(int[][] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length/2; j++) {
                System.out.println(j);
                int tmp = a[i][j];
                a[i][j] = a[i][a[0].length - j - 1];
                a[i][a[0].length - j - 1] = tmp;
            }
           for (int x = 0; x < a[0].length; x++) {
                if (a[i][x] == 0) {
                    a[i][x] = 1;
                } else if (a[i][x] == 1) {
                    a[i][x] = 0;
                }
            }
        }
        return a;
    }
    public int[][] flipAndInvertImage2(int[][] A) {
        for(int[] a : A){
            int len = a.length;
            for(int i = 0,j=len-1; i < len/2;i++,j--){
                // 如果前后对称位置的值不相等，无需变位和取反
                // 例如：第一位和最后一位的数值分别为1和0，翻转后为0和1，再反转后为1和0，所以无需任何操作就行
                // 1 0 ==翻转后==> 0 1 ==反转后==> 1 0
                if(a[i] != a[j]){
                    continue;
                } else {
                    // 如果前后位置相等，把前后对称的位置取反就行，1变0，0变1
                    a[i] = a[i]^1;
                    a[j] = a[j]^1;
                }
            }
            // 如果数组的个数不是2的倍数，需要把中间的位置的数字取反
            if(len%2 != 0){
                a[len/2] = a[len/2]^1;
            }
        }
        return A;
    }

    public int[][] flipAndInvertImage3(int[][] A) {
        if (A == null) {
            return null;
        }
        for (int[] row : A) {
            if (row == null) {
                continue;
            }
            for (int i = 0, j = row.length - 1; i < j; ++i,--j) {
                int t = row[i];
                row[i] = row[j];
                row[j] = t;
            }
            for(int i = 0; i < row.length; ++i) {
                row[i] = row[i] ^ 1;
            }
        }
        return A;
    }
    public static void main(String[] args) {
        int[][] a = {{1, 1, 0}, { 1,0, 1}, {0, 0, 0}};
        int[][] ints = flipAndInvertImage(a);
        for (int i = 0; i < ints.length; ++i) {
            for (int j = 0; j < ints[i].length; ++j) {
                System.out.print(ints[i][j]);
            }
            System.out.print("\n");
        }
    }
}