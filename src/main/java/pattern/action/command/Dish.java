package pattern.action.command;

/**
 * Created by byang059 on 2018/12/6.
 */
public class Dish {
    private String name;

    public Dish(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Dish{" +
                "name='" + name + '\'' +
                '}';
    }
}
