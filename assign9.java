import java.util.Scanner;

class assign9 {

    static int countDigits(int n) {
        int count = 0;
        while (n > 0) {
            count++;
            n /= 10;
        }
        return count;
    }

    static int[] getDigits(int n) {
        int count = countDigits(n);
        int[] digits = new int[count];

        for (int i = count - 1; i >= 0; i--) {
            digits[i] = n % 10;
            n /= 10;
        }
        return digits;
    }

    static boolean isDuck(int[] digits) {
        for (int d : digits) {
            if (d == 0)
                return true;
        }
        return false;
    }

    static boolean isArmstrong(int n, int[] digits) {
        int power = digits.length;
        int sum = 0;

        for (int d : digits) {
            sum += Math.pow(d, power);
        }

        return sum == n;
    }

    static void largestTwo(int[] arr) {
        int largest = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for (int i : arr) {
            if (i > largest) {
                second = largest;
                largest = i;
            } else if (i > second && i != largest) {
                second = i;
            }
        }

        System.out.println("Largest = " + largest);
        System.out.println("Second Largest = " + second);
    }

    static void smallestTwo(int[] arr) {
        int smallest = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;

        for (int i : arr) {
            if (i < smallest) {
                second = smallest;
                smallest = i;
            } else if (i < second && i != smallest) {
                second = i;
            }
        }

        System.out.println("Smallest = " + smallest);
        System.out.println("Second Smallest = " + second);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int n = sc.nextInt();

        int[] digits = getDigits(n);

        System.out.println("Digit Count = " + countDigits(n));

        System.out.print("Digits: ");
        for (int d : digits)
            System.out.print(d + " ");

        System.out.println("\nDuck Number = " + isDuck(digits));
        System.out.println("Armstrong Number = " + isArmstrong(n, digits));

        largestTwo(digits);
        smallestTwo(digits);

        sc.close();
    }
}
