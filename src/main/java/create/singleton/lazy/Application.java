package create.singleton.lazy;

/**
 * Created by byang059 on 2018/11/26.
 */
public class Application {


    /**
     * 单例懒汉
     * @param
     */
    public static void main(String[] args) {
        for (int i = 0; i < 15; i++) {
            new Thread(){
                @Override
                public void run() {
                    Singleton singleton1 = Singleton.getSingleton();
                    Singleton singleton2 = Singleton.getSingleton();
                    System.out.println(singleton1.toString());
                    System.out.println(singleton2.toString());
                }
            }.start();
        }
    }
}
