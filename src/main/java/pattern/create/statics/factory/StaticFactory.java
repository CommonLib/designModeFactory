package pattern.create.statics.factory;

/**
 * Created by byang059 on 2018/11/26.
 */
public class StaticFactory {
    public static Cat getCat() {
        return new Cat();
    }

    public static Dog getDog() {
        return new Dog();
    }
}
