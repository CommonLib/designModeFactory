package pattern.create.singleton.hungry;

/**
 * Created by byang059 on 2018/11/26.
 */
public class Singleton {
    private static Singleton singleton = new Singleton();

    private Singleton(){}

    public static Singleton getSingleton(){
        return singleton;
    }
}
