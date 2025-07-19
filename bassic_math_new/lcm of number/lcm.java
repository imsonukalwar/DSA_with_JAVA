public class lcm {
    // Method to calculate GCD (Greatest Common Divisor)
    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    public static int lcm1(int a, int b) {
        return (a * b) / gcd(a, b);
    }

    public static void main(String[] args) {
        int num1 = 12;
        int num2 = 18;

        int result = lcm1(num1, num2);
        System.out.println("LCM of " + num1 + " and " + num2 + " is: " + result);
    }
}
