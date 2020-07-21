package pattern.structure.bridge.pattern.abstraction;

import pattern.structure.bridge.pattern.tv.AbstractTv;

/**
 * Refined abstraction
 * Created by byang059 on 2019-03-21
 */
public class HaierRemoteControl extends AbstractRemoteControl {
    public HaierRemoteControl(AbstractTv tv) {
        super(tv);
    }

    public void lastChannel() {
        tv.tuneChannel();
        System.out.println("Haier lastChannel");
    }
}
