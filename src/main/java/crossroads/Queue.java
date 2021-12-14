package crossroads;

import java.util.LinkedList;
import java.util.List;

public class Queue {
    private List<Car> traffic;

    @Override
    public String toString() {
        return "Queue{" +
                "traffic=" + traffic +
                '}';
    }

    public Queue() {
        traffic = new LinkedList<>();
    }

    public void add(Car car) {

        traffic.add(car);
        System.out.println(car + " add in traffic");
    }

    public Car get() {

        Car car = traffic.get(0);
        traffic.remove(car);
        return car;
    }


    public boolean isEmpty() {
        return traffic.isEmpty();
    }
}
