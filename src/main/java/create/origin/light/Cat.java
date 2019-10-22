package create.origin.light;

import java.util.List;

/**
 * Created by byang059 on 2018/11/26.
 */
public class Cat implements Cloneable {
    private Integer age;
    private Integer color;
    private String name;
    private List<String> foots;
    private List<Foot> sizes;

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

    public List<String> getFoots() {
        return foots;
    }

    public void setFoots(List<String> foots) {
        this.foots = foots;
    }

    public List<Foot> getSizes() {
        return sizes;
    }

    public void setSizes(List<Foot> sizes) {
        this.sizes = sizes;
    }

    @Override
    public String toString() {
        return hashCode() + " Cat{" +
                "age=" + age +
                ", color=" + color +
                ", name='" + name + '\'' +
                ", foots=" + foots +
                ", sizes=" + sizes +
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

        public Builder buildFoots(List<String> foots) {
            cat.setFoots(foots);
            return this;
        }

        public Builder buildSize(List<Foot> sizes) {
            cat.setSizes(sizes);
            return this;
        }

        public Cat build() {
            return cat;
        }
    }

    @Override
    public Cat clone() {
        try {
            return (Cat) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return new Cat();
    }
}
