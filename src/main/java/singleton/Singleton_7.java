package singleton;

/**
 * Created on 2022/8/23 14:48
 *
 * @author Lakers
 *
 * Effective Java作者推荐的枚举单例(线程安全)
 */
public enum Singleton_7 {

    INSTANCE;
    public void test(){
        System.out.println("hi~");
    }
}
