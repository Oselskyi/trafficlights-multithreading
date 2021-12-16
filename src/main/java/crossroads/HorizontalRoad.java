package crossroads;

import java.util.LinkedList;
import java.util.List;

public class HorizontalRoad {

    private static volatile LinkedList<Car> horizontalTraffic;

    public HorizontalRoad() {
        horizontalTraffic = new LinkedList<>();
    }

    public synchronized void addToHorizontalTraffic(Car car) {

        horizontalTraffic.add(car);
        System.out.println(car + " has driven from keletska street");
        try {
            Thread.sleep(300);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public synchronized Car getHorizontal() {


        //while (horizontalTraffic.isEmpty()) {

            Car car = horizontalTraffic.getFirst();

            horizontalTraffic.removeFirst();
        try {
            Thread.sleep(300);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
            return car;
        }
      //  return null;
  //  }

    public boolean isEmpty() {
        return horizontalTraffic.isEmpty();
    }


}
