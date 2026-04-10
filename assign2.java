import java.util.Scanner;

class assign2 {

    static int calculateHandshakes(int n) {
        return (n * (n - 1)) / 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int numberOfStudents = sc.nextInt();

        int result = calculateHandshakes(numberOfStudents);

        System.out.println("Maximum number of handshakes: " + result);

        sc.close();
    }
}
