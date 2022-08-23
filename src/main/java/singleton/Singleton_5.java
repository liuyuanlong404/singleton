package singleton;

/**
 * Created on 2022/8/22 14:33
 *
 * @author Lakers
 *
 * 1. 双重锁校验(线程安全)
 */
public class Singleton_5 {

    private static volatile Singleton_5 instance;

    private Singleton_5() {
    }

    public static Singleton_5 getInstance(){
        if(null != instance) {
            return instance;
        }
        synchronized (Singleton_5.class){
            if (null == instance){
                instance = new Singleton_5();
            }
        }
        return instance;
    }
}
