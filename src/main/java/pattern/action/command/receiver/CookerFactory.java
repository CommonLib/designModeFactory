package pattern.action.command.receiver;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by byang059 on 2018/12/6.
 */
public class CookerFactory {

    static Map<String, CookAble> cookAbleMap = new HashMap<>();

    public static CookAble getCooker(String dish) {
        CookAble cookAble = cookAbleMap.get(dish);
        if (cookAble == null) {
            cookAble = new ChinaCooker();
            cookAbleMap.put(dish, cookAble);
        }
        return cookAble;
    }
}
