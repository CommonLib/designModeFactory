package action.command.concreteCommand;

import action.command.receiver.CookAble;
import action.command.receiver.CookCallBack;
import action.command.receiver.CookerFactory;
import action.command.Dish;
import action.command.client.Person;
import action.command.command.OrderUp;

/**
 * Created by byang059 on 2018/12/6.
 */
public class Order implements OrderUp {

    private String dish;
    private Person client;

    public void execute() {
        //send order to cooker
        CookAble cooker = CookerFactory.getCooker(dish);
        cooker.cook(dish, new CookCallBack() {
            public void onCookFinish(Dish dish) {
                client.eat(dish);
            }
        });
    }

    @Override
    public void undo() {
        CookAble cooker = CookerFactory.getCooker(dish);
        cooker.undoCook(dish);
    }

    public String getDish() {
        return dish;
    }

    public void orderDish(String dish) {
        this.dish = dish;
    }

    public Order(Person client) {
        this.client = client;
    }
}
