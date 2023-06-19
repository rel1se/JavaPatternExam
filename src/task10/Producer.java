package task10;

import java.util.concurrent.BlockingQueue;

public class Producer implements Runnable{
    private BlockingQueue<Integer> goods;
    public Producer(BlockingQueue<Integer> goods){
        this.goods = goods;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++){
            try {
                goods.put(i+1);
                int cnt = i + 1;
                System.out.println("Добавлен товар " + cnt);
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
