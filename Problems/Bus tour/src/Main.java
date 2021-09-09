import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int busHeight = Integer.parseInt(scanner.next());
        int numberOfBridges = Integer.parseInt(scanner.next());
        int crashingBridge = 0;
        boolean willCrashFlag = false;

        ArrayList<Integer> heightOfBridges = new ArrayList<>();

        for (int i = 0; i < numberOfBridges; i++) {
            heightOfBridges.add(scanner.nextInt());
        }

        for (int i = 0; i < heightOfBridges.size(); i++) {
            if (busHeight >= heightOfBridges.get(i)) {
                willCrashFlag = true;
                crashingBridge = i;
                break;
            }
        }

        if (!willCrashFlag) {
            System.out.println("Will not crash");
        } else {
            System.out.println("Will crash on bridge " + (crashingBridge + 1));
        }

    }
}