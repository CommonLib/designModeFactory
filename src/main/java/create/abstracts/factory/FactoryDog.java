package create.abstracts.factory;

/**
 * Created by byang059 on 2018/11/26.
 */
public class FactoryDog implements Factory {

    public Animal produceAnimal() {
        return new Dog();
    }
}
