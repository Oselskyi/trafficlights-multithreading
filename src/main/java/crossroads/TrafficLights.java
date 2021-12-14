package crossroads;

public class TrafficLights implements Runnable {

    Queue trafficQueue;

    @Override
    public String toString() {
        return "TrafficLights{" +
                "trafficQueue=" + trafficQueue +
                '}';
    }

    static boolean green = false;

    public TrafficLights(Queue trafficQueue) {
        this.trafficQueue = trafficQueue;
    }

    public static void changeLight() {

        green = !green;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(300);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        while (!trafficQueue.isEmpty()) {
            if (green) {
                Car car = trafficQueue.get();
                if (car != null) System.out.println("\n" + car + " drove across the road" + "\n");
            }
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
