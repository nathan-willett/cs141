public class ComputePay {
    public static void main(String[] args) {
        int hoursWorked = 0;
        double hourlySalary = 0.0;
        double totalPay = 0.0;
        double taxesOwed = 0.0;

        // Calculate pay at work based on hours worked each day
        System.out.println("My total hours worked:");
        System.out.println(4 + 5 + 8 + 4);

        System.out.println("My hourly salary:");
        System.out.println("$8.75");

        System.out.println("My total pay:");
        System.out.println((4 + 5 + 8 + 4) * 8.75);

        System.out.println("My taxes owed:"); // 20% tax
        System.out.println((4 + 5 + 8 + 4) * 8.75 * 0.20);
    }
}