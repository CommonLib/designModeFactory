package pattern.create.builder.model2;

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

    public static class Builder {

        private final Cat cat;

        public Builder() {
            cat = new Cat();
        }

        public Builder buildName(String name) {
            cat.setName(name);
            return this;
        }

        public Builder buildAge(Integer age) {
            cat.setAge(age);
            return this;
        }

        public Builder buildColor(Integer color) {
            cat.setColor(color);
            return this;
        }

        public Cat build() {
            return cat;
        }
    }
}
