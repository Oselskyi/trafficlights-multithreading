package crossroads;

public class HorizontalThread implements Runnable {


    public volatile HorizontalRoad horizontalRoad = new HorizontalRoad();

    @Override
    public void run() {
        if (horizontalRoad.isEmpty()) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        for (int i = 0; i < 15; i++) {

            synchronized (Main.monitor) {
                try {
                    while (Lighter.vertical) {
                        Main.monitor.wait();
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                Car car = horizontalRoad.get();
                System.out.println("\n" + car + " DROVE ACROSS THE 600-YEARS STREET" + "\n");

                Main.monitor.notify();
            }
        }
    }
}
