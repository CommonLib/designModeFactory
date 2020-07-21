package pattern.create.builder.model2;

/**
 * Created by byang059 on 2018/11/26.
 */
public class Application {


    /**
     * 建造者模式 辛苦建造一类对象，即属性需要多次动态配置
     * 构造函数比较多，需要动态初始化对象的多个参数
     *
     * @param
     */
    public static void main(String[] args) {
        Cat cat = new Cat.Builder().buildName("123").buildAge(11).buildColor(123).build();
        System.out.println(cat);
    }
}
