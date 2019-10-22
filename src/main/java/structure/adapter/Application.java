package structure.adapter;


/**
 * Created by byang059 on 2018/11/26.
 */
public class Application {

    public static void main(String[] args) {
        Fly bird = new FlyAdapter(new Chicken());
        start(bird);
    }

    public static void start(Fly fly){
        fly.fly();
    }
}
