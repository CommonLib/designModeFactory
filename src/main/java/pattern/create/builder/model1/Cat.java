package pattern.create.builder.model1;

/**
 * Created by byang059 on 2018/11/26.
 */
public class Cat {
    private Integer age;
    private Integer color;
    private String name;

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getColor() {
        return color;
    }

    public void setColor(Integer color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "age=" + age +
                ", color=" + color +
                ", name='" + name + '\'' +
                '}';
    }
}
