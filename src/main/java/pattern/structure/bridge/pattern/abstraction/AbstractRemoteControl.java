package pattern.structure.bridge.pattern.abstraction;

import pattern.structure.bridge.pattern.tv.AbstractTv;

/**
 * Created by byang059 on 2019-03-21
 */
public abstract class AbstractRemoteControl implements TV {

    protected final AbstractTv tv;

    public AbstractRemoteControl(AbstractTv tv) {
        this.tv = tv;
    }

    @Override
    public void on() {
        tv.on();
    }

    @Override
    public void off() {
        tv.off();
    }

    @Override
    public void tuneChannel() {
        tv.tuneChannel();
    }

    @Override
    public void menu() {
        tv.menu();
    }
}
