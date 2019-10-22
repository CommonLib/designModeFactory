package create.builder.model1;

/**
 * Created by byang059 on 2018/11/26.
 */
public class CatBuilder implements Builder {

    private final Cat cat;

    public CatBuilder() {
        cat = new Cat();
    }

    public void buildName() {
        cat.setName("123");
    }

    public void buildAge() {
        cat.setAge(11);
    }

    public void buildColor() {
        cat.setColor(12);
    }

    public Cat build() {
        return cat;
    }
}
