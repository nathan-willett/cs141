public class loopMysteryExam3 {
    public static void main(String[] args) {
        loopMysteryExam3M(20, 4);
    }

    public static int loopMysteryExam3M(int x, int y) {
        int z = x + y;
        while (x > 0 && y > 0) {
            x = x - y;
            y--;
            System.out.print(x + " " + y + " ");
        }
        System.out.println(y);
        //System.out.println(z);
        return z;
    }
}