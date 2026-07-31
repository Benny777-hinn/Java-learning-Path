public class Fibonacci {

    public static void main(String[] args) {
        int n = 10; // Number of terms to display
        int a = 0, b = 1;

        System.out.println("Fibonacci Series up to " + n + " terms:");

        for (int i = 1; i <= n; ++i) {
            System.out.print(a + " ");

            // Compute the next term
            int nextTerm = a + b;
            a = b;
            b = nextTerm;
        }
    }
    
}
