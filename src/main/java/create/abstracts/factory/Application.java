package create.abstracts.factory;

/**
 * Created by byang059 on 2018/11/26.
 */
public class Application {


    /**
     * 抽象工厂模式
     * @param
     */
    public static void main(String[] args) {
        FactoryDog factoryDog = new FactoryDog();
        Animal animal = factoryDog.produceAnimal();
        System.out.println(animal.toString());

        //好处，对修改封闭，对拓展开放，拓展原有功能只需要新建类
        FactoryCat factoryCat = new FactoryCat();
        Animal cat = factoryCat.produceAnimal();
        System.out.println(cat.toString());
    }
}
