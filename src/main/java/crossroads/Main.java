package crossroads;

public class Main {


    public static void main(String[] args) {
        Queue trafficQueue = new Queue();

        CarGenerator carGenerator = new CarGenerator(trafficQueue);
        TrafficLights trafficLights = new TrafficLights(trafficQueue);

        Thread thread = new Thread(carGenerator);
        Thread thread1 = new Thread(trafficLights);
        Thread thread2 = new Thread(new Changer());

        thread.start();
        thread1.start();
        thread2.start();

    }
}
