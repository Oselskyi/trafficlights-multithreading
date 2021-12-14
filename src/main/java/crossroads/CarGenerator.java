package crossroads;

import java.util.Random;

public class CarGenerator implements Runnable {
    Queue trafficQueue;

    public CarGenerator(Queue trafficQueue) {
        this.trafficQueue = trafficQueue;
    }

    @Override
    public void run() {
        for (int i = 0; i < 15; i++) {
            trafficQueue.add(new Car(getRandomBrand()));

            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public Brand getRandomBrand() {
        Random random = new Random();
        return Brand.values()[random.nextInt(Brand.values().length)];
    }
}
