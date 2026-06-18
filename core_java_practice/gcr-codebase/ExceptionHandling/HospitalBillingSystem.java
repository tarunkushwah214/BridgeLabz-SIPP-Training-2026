class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }
}

public class HospitalBillingSystem {

    static void processPayment(double billAmount, double paidAmount)
            throws InsufficientFundsException {

        if (paidAmount < billAmount) {
            throw new InsufficientFundsException(
                    "Payment failed: Insufficient funds.");
        }

        System.out.println("Payment successful.");
    }

    public static void main(String[] args) {

        // 1. Division by zero
        try {
            int totalBill = 5000;
            int items = 0;

            double avgCost = totalBill / items;
            System.out.println(avgCost);

        } catch (ArithmeticException e) {
            System.out.println("Billing Error: Number of items cannot be zero.");
        }

        // 2. Array out of bounds
        try {
            String[] patients = {"Rahul", "Aman", "Priya"};

            System.out.println(patients[5]);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Patient Error: Invalid patient index.");
        }

        // 3. Number format exception
        try {
            String input = "ABC123";

            int amount = Integer.parseInt(input);
            System.out.println(amount);

        } catch (NumberFormatException e) {
            System.out.println("Input Error: Please enter a valid numeric value.");
        }

        // 4. Custom exception
        try {
            processPayment(10000, 5000);

        } catch (InsufficientFundsException e) {
            System.out.println(e.getMessage());
        }
    }
}