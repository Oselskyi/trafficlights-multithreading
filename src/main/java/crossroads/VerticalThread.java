package crossroads;

public class VerticalThread implements Runnable {


    public volatile VerticalRoad verticalRoad = new VerticalRoad();

    @Override
    public void run() {
        if (verticalRoad.isEmpty()) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        for (int i = 0; i < 15; i++) {


            synchronized (Main.monitor) {
                try {
                    while (Lighter.horizontal) {
                        Main.monitor.wait();
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                Car car = verticalRoad.get();
                System.out.println("\n" + car + " DROVE ACROSS THE KELECKA STREET" + "\n");

                Main.monitor.notify();
            }
        }
    }
}
