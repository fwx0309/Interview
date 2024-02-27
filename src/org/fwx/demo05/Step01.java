package org.fwx.demo05;

/**
 * @ClassName Step01
 * @Description 需求：上台阶，一次上一级，或者一次上两级，求 n 级台阶的上法
 *          1   f(1)                1
 *          2   f(2)                2
 *          3   f(3)=f(1)+f(2)      3
 *          4   f(4)=f(2)+f(3)      5
 *          ...
 *          n   f(n)=f(n-2)+(n-1)   *
 * @Author Fwx
 * @Date 2024/2/27 14:31
 * @Version 1.0
 */
public class Step01 {
    // 递归实现
    public static int recursion(int n){

        if(n==1 || n==2){
            return n;
        }

        return recursion(n-2) + recursion(n-1);
    }

    public static void main(String[] args) {
        System.out.println(recursion(40));
    }
}
