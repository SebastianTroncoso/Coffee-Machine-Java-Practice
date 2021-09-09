import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int counter = 0;

        int i;

        do {
            i = scanner.nextInt();
            if (i > 0) {
                counter++;
            }
        } while (i > 0);


        System.out.println(counter);

    }
}