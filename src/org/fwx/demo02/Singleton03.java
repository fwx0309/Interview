package org.fwx.demo02;

/**
 * @ClassName Singleton03
 * @Description 饿汉式，这种方式可以在代码块中写逻辑操作
 * @Author Fwx
 * @Date 2024/2/26 21:19
 * @Version 1.0
 */
public class Singleton03 {
    public static Singleton03 INSTANCE = null;

    static {
        INSTANCE = new Singleton03();
    }

    private Singleton03(){}
}
