package create.singleton.lazy;

/**
 * Created by byang059 on 2018/11/26.
 */
public class Singleton {
    private static Singleton singleton;

    private Singleton() {
    }

    public static Singleton getSingleton() {
        if (singleton == null) {
            //synchronized耗时严重，外层增加判断增加效率
            synchronized (Singleton.class) {
                if (singleton == null) {
                    singleton = new Singleton();
                }
            }
        }
        return singleton;
    }
}
