import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n;
        
        do {
            n = Integer.parseInt(scanner.next());

            if (n % 2 == 0) {

                n = n / 2;

            } else if (n % 2 == 1) {

                n = (n * 3) + 1;

            }
            System.out.print(n + (n == 1 ? "" : " "));
        } while (n != 1);
    }
}