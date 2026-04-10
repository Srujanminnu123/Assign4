import java.util.Scanner;

class assign7 {

    static boolean isLeap(int year) {
        boolean a = (year % 4 == 0 && year % 100 != 0);
        boolean b = (year % 400 == 0);
        return a || b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter year: ");
        int year = sc.nextInt();

        if (year < 1582) {
            System.out.println("Invalid year (before Gregorian calendar)");
        } else {
            if (isLeap(year))
                System.out.println("Leap Year");
            else
                System.out.println("Not a Leap Year");
        }

        sc.close();
    }
}
