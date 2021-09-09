import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int num = new Scanner(System.in).nextInt();
        int sq = 1;

        while (num >= sq * sq) {
            System.out.println(sq * sq);
            sq++;
        }

    }
}