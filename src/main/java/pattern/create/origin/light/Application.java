package pattern.create.origin.light;

import java.util.ArrayList;

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
        ArrayList<String> foots = new ArrayList<String>();
        foots.add("abcd");
        ArrayList<Foot> sizes = new ArrayList<Foot>();
        sizes.add(new Foot(123));
        Cat cat = new Cat.Builder().buildName("123").buildAge(11).buildColor(123).buildFoots(foots).buildSize(sizes).build();
        Cat clone = cat.clone();
        System.out.println(cat);
        System.out.println(clone);
    }
}
