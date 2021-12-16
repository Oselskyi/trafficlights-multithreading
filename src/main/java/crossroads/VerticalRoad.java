package crossroads;

import java.util.LinkedList;
import java.util.List;

public class VerticalRoad {

    private static volatile LinkedList<Car> verticalTraffic;


    public VerticalRoad() {
        verticalTraffic = new LinkedList<>();
    }

    public synchronized void  addToVerticalTraffic(Car car) {

        verticalTraffic.add(car);
        System.out.println(car + " has driven from 600-years street");
//        try {
//            Thread.sleep(300);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }

    }


    public synchronized Car getVertical() {

       // while (verticalTraffic.isEmpty()) {

            Car car = verticalTraffic.getFirst();

            verticalTraffic.removeFirst();
        try {
            Thread.sleep(300);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
            return car;
        }
//        return null;
//    }

    public boolean isEmpty() {
        return verticalTraffic.isEmpty();
    }
}
