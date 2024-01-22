package Small_Problems_3A;

public class numberLoops4Constant {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <=5 - i; j++
                System.out.print(".");
            }
            System.out.print(i);
            for(int j = 1; j <= i - 1; j++) {
                System.out.print(".");
            }
            System.out.print();
        }
    }
}
