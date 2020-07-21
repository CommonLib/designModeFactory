package pattern.structure.bridge.pattern.tv;

/**
 * Created by byang059 on 2019-03-21
 */
public class HaierTV extends AbstractTv {
    @Override
    public void on() {
        System.out.println("HaierTV on");
    }

    @Override
    public void off() {
        System.out.println("HaierTV off");
    }

    @Override
    public void tuneChannel() {
        System.out.println("HaierTV tuneChannel");
    }

    @Override
    public void menu() {
        System.out.println("HaierTV menu");
    }
}
