package org.fwx.demo05;

/**
 * @ClassName Step02
 * @Description 需求：上台阶，一次上一级，或者一次上两级，求 n 级台阶的上法
 *
 *          用两个变量来记录上两个的结果，每次迭代更新这两个变量。设 one = f(1)、two = f(2)
 *          1   f(1)                1
 *          2   f(2)                2
 *          3   f(3)=f(1)+f(2)      3   = one(f(1)) + two(f(2))
 *          4   f(4)=f(2)+f(3)      5   = one(f(2)) + two(f(3))
 *          ...
 *          n   f(n)=f(n-2)+(n-1)   *   = one(f(n-2)) + two(f(n-1))
 * @Author Fwx
 * @Date 2024/2/27 14:31
 * @Version 1.0
 */
public class Step02 {
    // 递归实现
    public static int loop(int n){

        if(n==1 || n==2){
            return n;
        }

        int one = 1;
        int two = 2;
        int sum = one + two;

        for (int i = 3; i < n; i++) {
            one = two;
            two = sum;
            sum = one + two;
        }

        return sum;
    }

    public static void main(String[] args) {
        System.out.println(loop(40));
    }
}
