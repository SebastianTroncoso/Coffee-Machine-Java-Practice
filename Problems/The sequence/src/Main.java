import java.util.ArrayList;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int iterationTimes = Integer.parseInt(scanner.next());

        int counter = 0;

        boolean shouldBreak = false;

        for (int i = 1; i <= iterationTimes; i++) {

            for (int j = 1; j <= i; j++) {
                if (counter == iterationTimes) {
                    shouldBreak = true;
                    break;
                }
                counter++;
                System.out.print(i + " ");
            }
            if (shouldBreak) {
                break;
            }
        }
    }
}
