package org.fwx.demo02;

/**
 * @ClassName Singleton04
 * @Description 懒汉式，中只能用于单线程中，有线程安全问题
 * @Author Fwx
 * @Date 2024/2/26 21:23
 * @Version 1.0
 */
public class Singleton04 {
    private Singleton04 instance;
    private Singleton04(){}

    public Singleton04 getInstance(){
        if(instance == null){
            instance = new Singleton04();
        }
        return instance;
    }
}
