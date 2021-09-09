import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        /*System.out.println("Enter the number of the programming language" +
                "you are learning");
        System.out.println();
        System.out.println("1.Java");
        System.out.println("2.Kotlin");
        System.out.println("3.Scala");
        System.out.println("4.Python");*/

        int input = Integer.parseInt(scanner.next());

        switch (input) {
            case 1:
                System.out.println("Yes!");
                break;
            case 2:
                System.out.println("No!");
                break;
            case 3:
                System.out.println("No!");
                break;
            case 4:
                System.out.println("No!");
                break;
            default:
                System.out.println("Unknown number");
        }
    }
}