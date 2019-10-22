package create.singleton.hungry;

/**
 * Created by byang059 on 2018/11/26.
 */
public class Application {


    /**
     * 单例懒汉
     * @param
     */
    public static void main(String[] args) {
        Singleton singleton1 = Singleton.getSingleton();
        Singleton singleton2 = Singleton.getSingleton();
        System.out.println(singleton1.toString());
        System.out.println(singleton2.toString());
    }
}
