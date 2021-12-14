package multithreading;

public class MyFirstThread extends Thread{
    private volatile boolean green = true;

    public void changeColor(){

        green = !green;
    }
}
