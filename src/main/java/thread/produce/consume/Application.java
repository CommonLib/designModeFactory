package thread.produce.consume;

/**
 * Created by byang059 on 2018/11/26.
 */
public class Application {

    /*
    在多线程操作下，一个数组中最多只能存入 3 个元素。多放入不可以存入数组，或等待某线程对数组中某
    个元素取走才能放入，要求使用 java 的多线程来实现
    */
    public static void main(String[] args) {
        ArrayBlockQueue queue = new ArrayBlockQueue(1);
        for (int i = 0; i < 1; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    for (int i = 0; i < 100; i++) {
                        try {
                            queue.put("");
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }

                }
            }).start();
        }

        for (int i = 0; i < 1; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    for (int i = 0; i < 100; i++) {
                        String take = null;
                        try {
                            take = (String) queue.take();
                            Thread.sleep(2000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }

                    }

                }
            }).start();
        }

    }
}
