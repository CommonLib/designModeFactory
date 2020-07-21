package pattern.create.builder.model1;

/**
 * Created by byang059 on 2018/11/26.
 */
public class Application {


    /**
     * 建造者模式 辛苦建造一种对象，即属性只需要配置一次
     * @param
     */
    public static void main(String[] args) {
        CatDirector catDirector = new CatDirector(new CatBuilder());
        Cat cat = catDirector.buildCat();
        System.out.println(cat);
    }
}
