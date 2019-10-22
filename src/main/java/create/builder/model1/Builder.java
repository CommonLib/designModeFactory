package create.builder.model1;

/**
 * Created by byang059 on 2018/11/26.
 */
public interface Builder {
    void buildName();
    void buildAge();
    void buildColor();
    Cat build();
}
