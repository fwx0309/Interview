package org.fwx.demo02;

/**
 * @ClassName SingletonTest
 * @Description TODO
 * @Author Fwx
 * @Date 2024/2/26 20:46
 * @Version 1.0
 */
public class SingletonTest {
    public static void main(String[] args) {
        // Singleton01
        Singleton01 instance1 = Singleton01.INSTANCE;
        Singleton01 instance2 = Singleton01.INSTANCE;
        System.out.println(instance1 == instance2);
    }
}
