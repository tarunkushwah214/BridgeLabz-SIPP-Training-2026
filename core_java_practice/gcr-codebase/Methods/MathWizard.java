class MathWizard {

    // 🔹 Instance variable (belongs to object)
    int instanceValue = 100;

    // =========================
    // 1. Check Prime
    // =========================
    public boolean isPrime(int n) {
        if (n <= 1) return false;

        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    // =========================
    // 2. Factorial (int)
    // =========================
    public long factorial(int n) {
        long result = 1;   // 🔹 local variable

        for (int i = 1; i <= n; i++) {
            result *= i;
        }

        return result;
    }

    // =========================
    // 3. Overloaded Factorial (double)
    // =========================
    public double factorial(double n) {
        double result = 1.0;

        for (int i = 1; i <= (int)n; i++) {
            result *= i;
        }

        return result;
    }

    // =========================
    // 4. Fibonacci
    // =========================
    public int fibonacci(int n) {
        if (n <= 1) return n;

        int a = 0, b = 1;

        for (int i = 2; i <= n; i++) {
            int temp = a + b;
            a = b;
            b = temp;
        }

        return b;
    }

    // =========================
    // 5. GCD (Euclidean Algorithm)
    // =========================
    public int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    // =========================
    // 6. LCM
    // =========================
    public int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }

    // =========================
    // 7. Power (base^exp)
    // =========================
    public long power(int base, int exp) {
        long result = 1;

        for (int i = 1; i <= exp; i++) {
            result *= base;
        }

        return result;
    }

    // =========================
    // 8. Scope Demo
    // =========================
    public void scopeDemo() {
        int localValue = 50;  // 🔹 local variable

        System.out.println("Local variable: " + localValue);
        System.out.println("Instance variable: " + instanceValue);
    }
}