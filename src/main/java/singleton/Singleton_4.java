package singleton;

/**
 * Created on 2022/8/22 14:33
 *
 * @author Lakers
 *
 * 1. 使用类的内部类(线程安全)
 */
public class Singleton_4 {

    private static class SingletonHolder {
        private static Singleton_4 instance = new Singleton_4();
    }

    private Singleton_4() {
    }

    public static Singleton_4 getInstance() {
        return SingletonHolder.instance;
    }
}
