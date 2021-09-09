import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n;

        do {
            n = Integer.parseInt(scanner.nextLine());
            if (n % 2 != 0) {
                System.out.println("odd");
            } else if (n != 0 && n % 2 == 0) {
                System.out.println("even");
            } else if (n == 0) {
                break;
            }
        } while (n != 0);
    }
}