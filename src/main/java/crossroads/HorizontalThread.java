package crossroads;

public class HorizontalThread implements Runnable {


    public volatile HorizontalRoad horizontalRoad = new HorizontalRoad();

    @Override
    public void run() {
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        for (int i = 0; i < 15; i++) {

            synchronized (Main.lighter) {
                try {
                    while (Lighter.vertical) {
                        Main.lighter.wait();
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                Car car = horizontalRoad.getHorizontal();

                System.out.println("\n" + car + " DROVE ACROSS THE 600-YEARS STREET" + "\n");

                //Lighter.changeLight();
                Main.lighter.notify();
            }
        }
    }
}
