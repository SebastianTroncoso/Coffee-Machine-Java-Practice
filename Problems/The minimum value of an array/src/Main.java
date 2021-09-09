import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int arraySize = scanner.nextInt();

        int[] arrayElements = new int[arraySize];

        for (int i = 0; i < arraySize; i++) {
            arrayElements[i] = scanner.nextInt();
        }

        Arrays.sort(arrayElements, 0, arraySize);

        System.out.println(arrayElements[0]);
    }
}