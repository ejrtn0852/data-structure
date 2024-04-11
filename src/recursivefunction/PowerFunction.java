package recursivefunction;

public class PowerFunction {

    public static void main(String[] args) {
        int power = power(2, 4);

        int i = powerLoop(2, 4);
    }

    public static int power(int x, int y) {
        if (y == 0) {
            return 1;
        }
        return x * power(x, y-1);
    }

    public static int powerLoop(int x, int y) {
        int result = 1;
        for (int i = 0; i < y; i++) {
            result *= x;
        }
        return result;
    }

}
