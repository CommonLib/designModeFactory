package structure.adapter;

/**
 * Created by byang059 on 2019-01-24
 */
public class FlyAdapter implements Fly {

    private final Chicken chicken;

    public FlyAdapter(Chicken chicken) {
        this.chicken = chicken;
    }

    @Override
    public void fly() {
        chicken.hok();
    }
}
