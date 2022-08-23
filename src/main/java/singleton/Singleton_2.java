package singleton;

/**
 * Created on 2022/8/22 14:33
 *
 * @author Lakers
 *
 * 1. 懒汉模式(线程安全)
 */
public class Singleton_2 {

    private static Singleton_2 instance;

    private Singleton_2() {
    }

    @SuppressWarnings("all")
    public static synchronized Singleton_2 getInstance(){
        if (null != instance) {
            return instance;
        }
        instance = new Singleton_2();
        return instance;
    }
}
