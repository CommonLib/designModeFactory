package thread.produce.consume;

import java.util.LinkedList;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by byang059 on 2019-01-29
 */
public class ArrayBlockQueue {
    private final int capacity;
    private int currentSize;
    private int index;
    LinkedList<Object> elements;
    private final ReentrantLock lock;
    private final Condition inputCondition;
    private final Condition outputCondition;

    public ArrayBlockQueue(int capacity) {
        this.elements = new LinkedList<>();
        this.capacity = capacity;
        currentSize = 0;
        lock = new ReentrantLock(true);
        inputCondition = lock.newCondition();
        outputCondition = lock.newCondition();
    }

    public void put(Object obj) throws InterruptedException {
        lock.lock();
        if (currentSize >= capacity) {
            inputCondition.await();
        }
        elements.addFirst(obj + "" + index);
        System.out.println(Thread.currentThread().getName() + " 生产者生产" + index);
        currentSize++;
        index++;
        outputCondition.signal();
        lock.unlock();
    }

    public Object take() throws InterruptedException {
        lock.lock();
        if (currentSize == 0) {
            outputCondition.await();
        }
        Object last = elements.pollLast();
        System.out.println(Thread.currentThread().getName()+ " 消费者消费" + last);
        currentSize--;
        inputCondition.signal();
        lock.unlock();
        return last;
    }
}
