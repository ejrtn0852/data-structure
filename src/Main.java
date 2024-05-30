import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numOfSubject = scanner.nextInt();

        int[] subject = new int[numOfSubject];
        int highScore = 0;
        for (int i = 0; i < numOfSubject; i++) {
            int score = scanner.nextInt();
            if (highScore < score) {
                highScore = score;
            }
            subject[i] = score;
        }

        double totalScore = 0;
        for (int i = 0; i < subject.length; i++) {
            int subScore  = subject[i];

            totalScore += (double) subScore / highScore * 100;
        }

        System.out.println(totalScore/numOfSubject);




    }
}
