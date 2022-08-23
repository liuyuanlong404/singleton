package singleton;

import java.util.concurrent.atomic.AtomicReference;

/**
 * Created on 2022/8/22 14:33
 *
 * @author Lakers
 *
 * 1.  CAS「AtomicReference」(线程安全)
 */
public class Singleton_6 {

    private static final AtomicReference<Singleton_6> INSTANCE = new AtomicReference<Singleton_6>();

    private Singleton_6() {
    }

    public static final Singleton_6 getInstance() {
        for (; ; ) {
            Singleton_6 instance = INSTANCE.get();
            if (null != instance) {
                return instance;
            }
            INSTANCE.compareAndSet(null, new Singleton_6());
            return INSTANCE.get();
        }
    }

    public static void main(String[] args) {
        System.out.println(Singleton_6.getInstance());
        System.out.println(Singleton_6.getInstance());
    }
}
