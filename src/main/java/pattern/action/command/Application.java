package pattern.action.command;


import pattern.action.command.client.Person;
import pattern.action.command.command.OrderUp;
import pattern.action.command.invoker.Waiter;

/**
 * Created by byang059 on 2018/11/26.
 */
public class Application {

    /**
     * Command（OrderUp）：
     * 定义命令的接口，声明执行的方法。
     * ConcreteCommand(Order)：
     * 命令接口实现对象，是“虚”的实现；通常会持有接收者，并调用接收者的功能来完成命令要执行的操作。
     * Receiver(ChinaCooker)：
     * 接收者，真正执行命令的对象。任何类都可能成为一个接收者，只要它能够实现命令要求实现的相应功能。
     * Invoker(Waiter)：
     * 要求命令对象执行请求，通常会持有命令对象，可以持有很多的命令对象。这个是客户端真正触发命令并要求命令执行相应操作的地方，也就是说相当于使用命令对象的入口。
     * NioClient(Person)：
     * 创建具体的命令对象，并且设置命令对象的接收者。注意这个不是我们常规意义上的客户端，而是在组装命令对象和接收者，或许，把这个Client称为装配者会更好理解，因为真正使用命令的客户端是从Invoker来触发执行。
     *
     * 理解：
     * Invoker是Command的直接执行者，且不知道命令的执行者和请求者是什么，只知道一个执行命令的方法（execute），即可达到自己想要的目标
     *
     * 优点：
     * 将请求封装成对象，
     * @param args
     */
    public static void main(String[] args) {
        Person client = new Person();
        OrderUp order = client.createOrder("鱼香肉丝");

        Waiter waiter = new Waiter();
        waiter.addOrder(order);
        waiter.makeOrder();

//        waiter.cancelOrder(order);
    }
}
