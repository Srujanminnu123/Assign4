import java.util.Scanner;

class assign6 {

    static int recursiveSum(int n) {
        if (n == 1)
            return 1;
        return n + recursiveSum(n - 1);
    }

    static int formulaSum(int n) {
        return (n * (n + 1)) / 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Not a natural number");
        } else {
            int rec = recursiveSum(n);
            int form = formulaSum(n);

            System.out.println("Recursive Sum = " + rec);
            System.out.println("Formula Sum = " + form);

            if (rec == form)
                System.out.println("Both results are correct");
            else
                System.out.println("Results are different");
        }

        sc.close();
    }
}
