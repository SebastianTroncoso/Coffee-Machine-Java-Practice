public class Main {

    public static void main(String[] args) {
        int count = 0;
        for (Secret star : Secret.values()) {
            count = star.name().startsWith("STAR") ? count + 1 : count;
        }
        System.out.println(count);
    }
}
/*   enum Secret {
    STAR, CRASH, START
}*/
