package task10;

import java.util.concurrent.BlockingQueue;

public class Consumer implements Runnable{
    BlockingQueue<Integer> goods;
    public Consumer(BlockingQueue<Integer> goods){
        this.goods = goods;
    }
    @Override
    public void run() {
        for (int i = 0; i < 5; i++){
            try{
                goods.put(i + 1);
                int cnt = i + 1;
                System.out.println("Товар добавлен " + cnt);
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
