package pattern.structure.bridge.pattern.tv;

/**
 * Created by byang059 on 2019-03-21
 */
public class SonyTV extends AbstractTv {
    @Override
    public void on() {
        System.out.println("SonyTV on");
    }

    @Override
    public void off() {
        System.out.println("SonyTV off");
    }

    @Override
    public void tuneChannel() {
        System.out.println("SonyTV tuneChannel");
    }

    @Override
    public void menu() {
        System.out.println("SonyTV menu");
    }
}
