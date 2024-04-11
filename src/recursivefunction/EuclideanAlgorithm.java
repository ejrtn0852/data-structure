package recursivefunction;

public class EuclideanAlgorithm {

    public static void main(String[] args) {
        int big = 72;
        int min = 30;

        int i = big % min;
        System.out.println("i = " + i);

        int result = result(big, min);
        System.out.println("result = " + result);

        int recursive = recursive(72, 30);
        System.out.println("recursive = " + recursive);


    }

    public static int result(int x, int y) {
        while(y != 0) {
            int r = x % y;
            x = y;
            y = r;
        }
        return x;
    }

    public static int recursive(int x, int y) {
        if (y == 0) {
            return x;
        }
        int r = x % y;
        x = y;
        y = r;
        return recursive(x,y);
    }
}
