
    import java.util.Scanner;

    public class NestedTryCatch {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Taking array input
            System.out.print("Enter the size of the array: ");
            int size = scanner.nextInt();
            int[] arr = new int[size];

            System.out.println("Enter the elements of the array: ");
            for (int i = 0; i < size; i++) {
                arr[i] = scanner.nextInt();
            }

            // Taking index and divisor input
            System.out.print("Enter the index of the element to access: ");
            int index = scanner.nextInt();

            System.out.print("Enter the divisor: ");
            int divisor = scanner.nextInt();

            // Implementing nested try-catch
            try {
                int element = arr[index]; // May throw ArrayIndexOutOfBoundsException

                try {
                    int result = element / divisor; // May throw ArithmeticException
                    System.out.println("Result: " + result);
                } catch (ArithmeticException e) {
                    System.out.println("Cannot divide by zero!");
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Invalid array index!");
            }

            scanner.close();
        }
    }


