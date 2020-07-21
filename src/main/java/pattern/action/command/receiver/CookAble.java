package pattern.action.command.receiver;

/**
 * Created by byang059 on 2018/12/6.
 */
public interface CookAble {
    void cook(String dish, CookCallBack cookCallBack);
    void undoCook(String dish);
}
