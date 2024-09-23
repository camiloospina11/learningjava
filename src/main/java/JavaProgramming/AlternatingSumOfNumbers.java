package JavaProgramming;
import java.util.Scanner;

public class AlternatingSumOfNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            int alternatingSum = 0;

            for (int j = 0; j < n; j++) {
                int num = scanner.nextInt();
                if (j % 2 == 0) {
                    alternatingSum += num;
                }
                else {
                    alternatingSum -= num;
                }
            }
            System.out.println(alternatingSum);
        }

        scanner.close();
    }
}
