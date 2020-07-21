package pattern.action.command.receiver;

import pattern.action.command.Dish;

/**
 * Created by byang059 on 2018/12/6.
 */
public interface CookCallBack {
    void onCookFinish(Dish dish);
}
