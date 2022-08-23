package singleton;

/**
 * Created on 2022/8/22 14:33
 *
 * @author Lakers
 *
 * 1. 饿汉模式(线程安全)
 */
public class Singleton_3 {

    @SuppressWarnings("all")
    private static Singleton_3 instance = new Singleton_3();

    private Singleton_3() {
    }

    public static Singleton_3 getInstance() {
        return instance;
    }
}
