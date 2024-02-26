package org.fwx.demo02;

/**
 * @ClassName Singleton01
 * @Description 饿汉式
 * @Author Fwx
 * @Date 2024/2/26 20:43
 * @Version 1.0
 */
public class Singleton01 {
    public static final Singleton01 INSTANCE = new Singleton01();

    private Singleton01(){}
}
