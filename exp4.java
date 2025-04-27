public class exp4 {
    public static void main(String[] args) {
        try {
            int a = 10, b = 0;
            int result = a / b; 
            System.out.println("Result: " + result);

        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");

        } finally {
            System.out.println("Execution of try-catch block completed.");

        }
        System.out.println("Program continues normally.");
    }
}
