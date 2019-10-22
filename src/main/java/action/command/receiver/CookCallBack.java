package action.command.receiver;

import action.command.Dish;

/**
 * Created by byang059 on 2018/12/6.
 */
public interface CookCallBack {
    void onCookFinish(Dish dish);
}
