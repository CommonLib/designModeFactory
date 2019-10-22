package structure.bridge.pattern;


import structure.bridge.pattern.abstraction.SonyRemoteControl;
import structure.bridge.pattern.tv.AbstractTv;
import structure.bridge.pattern.tv.SonyTV;

/**
 * Created by byang059 on 2018/11/26.
 */
public class Application {

    /**
     * 桥接模式
     * 将抽象（TV）与实现(HaierTV)分离，使它们可以独立变化(TV添加新功能，对于TV无影响)。它是用组合关系代替继承关系来实现
     * 抽象化（abstraction）角色1个：定义抽象类，并包含一个对实现化对象的引用。
     * 扩展抽象化（Refined abstraction）角色n个：是抽象化角色的子类，实现父类中的业务方法，并通过组合关系调用实现化角色中的业务方法。
     * 实现化（Implementor）角色1个：定义实现化角色的接口，供扩展抽象化角色调用。
     * 具体实现化（Concrete Implementor）角色n个：给出实现化角色接口的具体实现。
     * 类和类关系
     * abstraction, Refined abstraction 实现
     * Implementor, Concrete Implementor 实现
     * abstraction, Implementor 组合关系
     *
     * 桥梁模式和适配器模式的区别
     *
     * 共同点：桥接和适配器都是让两个东西配合工作
     *       类的行为上一致：A类实现B接口，构造传入C类（不实现B接口），A类对接口B的覆写转化为对C类的调用
     * 不同点：出发点不同。
     *          适配器：改变已有的两个接口，让他们相容。
     *          桥接模式：分离抽象化和实现，使两者的接口可以不同，目的是分离。
     *
     * 所以说，如果你拿到两个已有模块，想让他们同时工作，那么你使用的适配器。
     * 如果你还什么都没有，但是想分开实现，那么桥接是一个选择。
     *
     * 桥接是先有桥，才有两端的东西
     * 适配是先有两边的东西，才有适配器
     *
     * 桥接是在桥好了之后，两边的东西还可以变化。
     *
     * @param args
     */
    public static void main(String[] args) {
        AbstractTv tv = new SonyTV();
        SonyRemoteControl remote = new SonyRemoteControl(tv);
        remote.on();
        remote.nextChannel();

        //当TV接口 增加新的功能方法时 HaierTV不会收到影响，只需要在桥接上调用对应的方法即可
    }
}
