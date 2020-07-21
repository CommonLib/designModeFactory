package pattern.structure.bridge.pattern.abstraction;

import pattern.structure.bridge.pattern.tv.AbstractTv;

/**
 * Refined abstraction
 * Created by byang059 on 2019-03-21
 */
public class SonyRemoteControl extends AbstractRemoteControl {
    public SonyRemoteControl(AbstractTv tv) {
        super(tv);
    }

    public void nextChannel(){
        tv.tuneChannel();
        System.out.println("Sony nextChannel");
    }
}
