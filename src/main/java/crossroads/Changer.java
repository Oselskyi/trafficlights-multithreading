package crossroads;

public class Changer implements Runnable {

    @Override
    public void run() {
        try {
            Thread.sleep(1300);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        TrafficLights.changeLight();
    }
}
