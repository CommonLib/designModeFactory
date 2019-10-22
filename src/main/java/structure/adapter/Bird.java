package structure.adapter;

/**
 * Created by byang059 on 2019-01-24
 */
public class Bird implements Fly {
    @Override
    public void fly() {
        System.out.println("起飞");
    }
}
