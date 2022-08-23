package singleton;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created on 2022/8/22 14:33
 *
 * @author Lakers
 *
 * 1. 懒汉模式(线程不安全)
 */
public class Singleton_1 {

    private static Singleton_1 instance;

    private Singleton_1() {
    }

    @SuppressWarnings("all")
    public static Singleton_1 getInstance(){
        if (null != instance) {
            return instance;
        }
        instance = new Singleton_1();
        return instance;
    }
}
