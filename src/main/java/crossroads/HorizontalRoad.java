package crossroads;

import java.util.LinkedList;

public class HorizontalRoad {

    private static LinkedList<Car> horizontalTraffic;

    public HorizontalRoad() {
        horizontalTraffic = new LinkedList<>();
    }

    public void add(Car car) {

        horizontalTraffic.add(car);
        System.out.println(car + " has driven from keletska street");
        try {
            Thread.sleep(300);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public Car get() {

        Car car = horizontalTraffic.getFirst();

        horizontalTraffic.removeFirst();
        try {
            Thread.sleep(300);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return car;
    }


    public boolean isEmpty() {
        return horizontalTraffic.isEmpty();
    }


}
