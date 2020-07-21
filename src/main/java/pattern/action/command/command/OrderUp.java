package pattern.action.command.command;

/**
 * Created by byang059 on 2018/12/6.
 */
public interface OrderUp {
    void execute();

    void undo();//支持撤销的操作
}
