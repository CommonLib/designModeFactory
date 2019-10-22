package action.command.client;


import action.command.Dish;
import action.command.command.OrderUp;
import action.command.concreteCommand.Order;

/**
 * Created by byang059 on 2018/12/6.
 */
public class Person {
    public void eat(Dish dish) {
        System.out.println(dish);
    }

    public OrderUp createOrder(String dish) {
        Order order = new Order(this);
        order.orderDish(dish);
        return order;
    }
}
