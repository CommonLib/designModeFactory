package pattern.action.command.receiver;

import pattern.action.command.Dish;

import java.util.Objects;

/**
 * Created by byang059 on 2018/12/6.
 */
public class ChinaCooker implements CookAble {

    private String undoDish;

    public void cook(final String dish, final CookCallBack cookCallBack) {
        new Thread(new Runnable() {
            public void run() {
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                if (!Objects.equals(dish, undoDish)) {
                    System.out.println("烹饪完成" + dish);
                    cookCallBack.onCookFinish(new Dish(dish));
                } else {
                    System.out.println("取消烹饪" + dish);
                }
            }
        }).start();
        System.out.println("开始烹饪" + dish);
    }

    @Override
    public void undoCook(String undoDish) {
        this.undoDish = undoDish;
    }
}
