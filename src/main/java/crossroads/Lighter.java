package crossroads;

public class Lighter {
    static boolean vertical = false;
    static boolean horizontal = true;

    public static void changeLight() {

        vertical = !vertical;
        horizontal = !horizontal;

    }
}
