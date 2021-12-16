//package crossroads;
//
//import java.util.LinkedList;
//import java.util.List;
//
//
//public class Queue {
//    private List<Car> horizontalTraffic;
//    private List<Car> verticalTraffic;
//Tumbler tumbler = new Tumbler();
//
//    public Queue() {
//        horizontalTraffic = new LinkedList<>();
//        verticalTraffic = new LinkedList<>();
//    }
//
//    public void addToHorizontalTraffic(Car car) {
//
//        horizontalTraffic.add(car);
//        System.out.println(car + " has driven from 600-years street");
//        try {
//            Thread.sleep(500 + (long) (Math.random() * 1500));
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//
//    }
//    public void addToVerticalTraffic(Car car) {
//
//        verticalTraffic.add(car);
//        System.out.println(car + " has driven from Keletska street");
//        try {
//            Thread.sleep(500 + (long) (Math.random() * 1500));
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//
//    }
//
//
//    public synchronized void getHorizontal() {
//
//        while ((HorizontalLighter.green && !VerticalLighter.green)||(!HorizontalLighter.green && VerticalLighter.green) ){
//            try {
//                wait();
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }
//            try {
//                Thread.sleep(1000);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//
//            Car car = horizontalTraffic.get(0);
//            System.out.println("\n" + car + " drove across the " + Thread.currentThread().getName() + " street" + "\n");
//            horizontalTraffic.remove(car);
//            //tumbler.changeLight();
//            notify();
//    }
//    public synchronized void getVertical() {
//
//        while ((HorizontalLighter.green && !VerticalLighter.green)||(!HorizontalLighter.green && VerticalLighter.green) ){
//            try {
//                wait();
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }
//            try {
//                Thread.sleep(1000);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//
//            Car car = verticalTraffic.get(0);
//            System.out.println("\n" + car + " drove across the " + Thread.currentThread().getName() + " street" + "\n");
//            verticalTraffic.remove(car);
//            //tumbler.changeLight();
//            notify();
//    }
//
//
////    public boolean isEmpty() {
////        return traffic.isEmpty();
////    }
//
//
//}
