package crossroads;

import java.util.LinkedList;

public class VerticalRoad {

    private static LinkedList<Car> verticalTraffic;


    public VerticalRoad() {
        verticalTraffic = new LinkedList<>();
    }

    public  void  add(Car car) {

        verticalTraffic.add(car);
        System.out.println(car + " has driven from 600-years street");

    }


    public  Car get() {

            Car car = verticalTraffic.getFirst();

            verticalTraffic.removeFirst();
        try {
            Thread.sleep(300);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
            return car;
        }


    public boolean isEmpty() {
        return verticalTraffic.isEmpty();
    }
}
