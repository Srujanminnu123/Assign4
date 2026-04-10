import java.util.Scanner;

class assign1 {

    static float calculateSI(float p, float r, float t) {
        return (p * r * t) / 100;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Principal: ");
        float principal = sc.nextFloat();

        System.out.print("Enter Rate: ");
        float rate = sc.nextFloat();

        System.out.print("Enter Time: ");
        float time = sc.nextFloat();

        float si = calculateSI(principal, rate, time);

        System.out.println("The Simple Interest is " + si +
                " for Principal " + principal +
                ", Rate of Interest " + rate +
                " and Time " + time);

        sc.close();
    }
}
