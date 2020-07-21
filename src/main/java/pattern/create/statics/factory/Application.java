package pattern.create.statics.factory;

/**
 * Created by byang059 on 2018/11/26.
 */
public class Application {



    public static void main(String[] args) {
        Animal cat = staticFactory("cat");
        Animal dog = staticFactory("dog");
        System.out.println(cat.toString());
        System.out.println(dog.toString());
    }

    /**
     * 静态工厂模式
     * @param
     */
    public static Animal staticFactory(String category){
        Animal animal;
        if (category.equals("cat")){
            animal = StaticFactory.getCat();
        }else{
            animal = StaticFactory.getDog();
        }
        return animal;
    }
}
