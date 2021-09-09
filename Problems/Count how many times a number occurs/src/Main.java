import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int nTimes = 0;

        int arraySize = scanner.nextInt();

        int[] arrayElements = new int[arraySize];

        for (int i = 0; i < arraySize; i++) {
            arrayElements[i] = scanner.nextInt();
        }

        int n = scanner.nextInt();

        for (int i = 0; i < arraySize; i++){
            if (arrayElements[i] == n) {
                nTimes++;
            }
        }

        System.out.println(nTimes);

    }
}