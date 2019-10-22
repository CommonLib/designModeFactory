package action.command.invoker;

import action.command.command.OrderUp;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by byang059 on 2018/12/6.
 */
public class Waiter {

    public List<OrderUp> orders = new ArrayList<>();

    public void addOrder(OrderUp orderUp) {
        orders.add(orderUp);
    }

    public void makeOrder() {
        for (OrderUp order : orders) {
            order.execute();
        }
        orders.clear();
    }

    public void cancelOrder(OrderUp order){
        order.undo();
    }
}
