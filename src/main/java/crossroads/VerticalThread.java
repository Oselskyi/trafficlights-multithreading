package crossroads;

public class VerticalThread implements Runnable {


    public volatile VerticalRoad verticalRoad = new VerticalRoad();

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
                while (Lighter.horizontal) {
                    Main.lighter.wait();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            Car car = verticalRoad.getVertical();
            //if (car != null){
                System.out.println("\n" + car + " DROVE ACROSS THE KELECKA STREET" + "\n");
            //}
            //Lighter.changeLight();
            Main.lighter.notify();
        }
        }
    }
}
