package multithreading;


import java.util.LinkedList;

public class Main {
    public static LinkedList<String> createQueue(){
         LinkedList<String> queue = new LinkedList<>();
         queue.add("Mazda");
         queue.add("Opel");
         queue.add("BMW");
         queue.add("Honda");
         return queue;
    }


    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            MyFirstThread myThread = new MyFirstThread();
            myThread.start();
        }
    }
}
