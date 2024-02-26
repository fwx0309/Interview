package org.fwx.demo02;

/**
 * @ClassName Singleton04
 * @Description 懒汉式，没有线程安全问题
 * @Author Fwx
 * @Date 2024/2/26 21:23
 * @Version 1.0
 */
public class Singleton05 {
    private static Singleton05 instance;
    private Singleton05(){}

    public static Singleton05 getInstance(){
        if(instance==null){
            synchronized (Singleton05.class) {
                if(instance == null){
                    instance = new Singleton05();
                }
            }
        }
        return instance;
    }
}
