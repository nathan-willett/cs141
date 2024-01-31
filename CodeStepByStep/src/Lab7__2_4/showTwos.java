public class showTwos {
    public static void main(String[] args) {
        showTwos(7);
    }

    public static void showTwos(int n) {
        System.out.print(n + " = ");
        while (n % 2 == 0) {
            System.out.print("2 * ");
        }
    }
}