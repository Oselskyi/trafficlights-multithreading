package crossroads;

public class Tumbler implements Runnable {


    public void run() {
        while (true) {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            Lighter.changeLight();
        }

    }
}
