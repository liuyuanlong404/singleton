package singleton;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created on 2022/8/22 14:33
 *
 * @author Lakers
 *
 * 0. 静态类使用
 */
public class Singleton_0 {

    public static Map<String,String> cache = new ConcurrentHashMap<>();
}
