package org.fwx.demo02;

/**
 * @ClassName Singleton06
 * @Description 懒汉式，内部类方式，内部类在使用时才加载
 * @Author Fwx
 * @Date 2024/2/26 21:30
 * @Version 1.0
 */
public class Singleton06 {
    private Singleton06(){}

    public static Singleton06 getInstace(){
        return Inner.INSTANCE;
    }

    private static class Inner{
        private static final Singleton06 INSTANCE = new Singleton06();
    }
}
