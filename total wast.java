public class total wast {
    import java.util.Scanner;

    static double calculateTotalWaste(double point1Waste, double point2Waste) {
        return point1Waste + point2Waste;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter waste collected at Point 1 (kg): ");
        double point1Waste = sc.nextDouble();

        System.out.print("Enter waste collected at Point 2 (kg): ");
        double point2Waste = sc.nextDouble();

        double totalWaste = calculateTotalWaste(point1Waste, point2Waste);

        System.out.println("Total waste collected: " + totalWaste + " kg");

        sc.close();
    }
}
}
