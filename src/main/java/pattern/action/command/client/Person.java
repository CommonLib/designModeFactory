package pattern.action.command.client;


import pattern.action.command.Dish;
import pattern.action.command.command.OrderUp;
import pattern.action.command.concreteCommand.Order;

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
