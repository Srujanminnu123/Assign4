import java.util.Scanner;

class assign3 {

    static float calculateRounds(float a, float b, float c) {
        float perimeter = a + b + c;
        return 5000 / perimeter; // 5 km = 5000 meters
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 3 sides of triangle: ");
        float side1 = sc.nextFloat();
        float side2 = sc.nextFloat();
        float side3 = sc.nextFloat();

        float rounds = calculateRounds(side1, side2, side3);

        System.out.println("Number of rounds required: " + rounds);

        sc.close();
    }
}
