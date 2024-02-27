package org.fwx.demo06;

/**
 * @ClassName Variable
 * @Description TODO
 * @Author Fwx
 * @Date 2024/2/27 15:30
 * @Version 1.0
 */

public class VariableDemo {
    static int s;//成员变量，类变量
    int i;//成员变量，实例变量
    int j;//成员变量，实例变量

    // *** 非静态代码块，每次初始化对象时都会执行 ***
    {
        int i = 1;//非静态代码块中的局部变量 i
        i++;
        j++;
        s++;
    }

    public void test(int j){//形参，局部变量,j
        j++;
        i++;
        s++;
    }

    public static void main(String[] args) {//形参，局部变量，args
        VariableDemo obj1 = new VariableDemo();//局部变量，obj1
        VariableDemo obj2 = new VariableDemo();//局部变量，obj1
        obj1.test(10);
        obj1.test(20);
        obj2.test(30);
        System.out.println(obj1.i + "," + obj1.j + "," + obj1.s);
        System.out.println(obj2.i + "," + obj2.j + "," + obj2.s);
    }
}
