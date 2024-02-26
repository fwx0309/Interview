package org.fwx;

/**
 * @ClassName Demo01
 * @Description TODO
 * @Author Fwx
 * @Date 2024/2/26 16:07
 * @Version 1.0
 */
public class Demo01 {
    public static void main(String[] args) {
        int i = 1;
        i = i++;    // 这里操作数栈中 1 赋值给 i，所以这部操作完后，i = 1
        int j = i++;
        int k = i+ ++i * i++;
        System.out.println("i = " + i);
        System.out.println("j = " + j);
        System.out.println("k = " + k);
    }
}
