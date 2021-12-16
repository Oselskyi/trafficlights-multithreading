package crossroads;

public class Main {
    public static Object lighter = new Object();
    public static volatile HorizontalRoad horizontalRoad = new HorizontalRoad();
    public static volatile VerticalRoad verticalRoad = new VerticalRoad();
    public static void main(String[] args) {



        Thread carGenerate = new Thread(new CarGenerator(horizontalRoad, verticalRoad));
        Thread lighter = new Thread(new Tumbler());
        Thread horizontal = new Thread(new HorizontalThread());
        Thread vertical = new Thread(new VerticalThread());


        carGenerate.start();
        lighter.start();
        horizontal.start();
        vertical.start();


    }
}
