package crossroads;

import java.util.Random;

public class CarGenerator implements Runnable {

    public volatile HorizontalRoad horizontalRoad;
    public volatile VerticalRoad verticalRoad;

    public CarGenerator(HorizontalRoad horizontalRoad, VerticalRoad verticalRoad) {

        this.horizontalRoad = horizontalRoad;
        this.verticalRoad = verticalRoad;
    }

    @Override
    public void run() {
        for (int i = 0; i < 15; i++) {

            verticalRoad.add(new Car(getRandomBrand()));
            horizontalRoad.add(new Car(getRandomBrand()));
        }
    }

    public Brand getRandomBrand() {
        Random random = new Random();
        return Brand.values()[random.nextInt(Brand.values().length)];
    }
}
