import java.util.Scanner;

public class SentinalSum {
    public static Scanner scanner = new Scanner(System.in);
    public static int getIntInput(String prompt) {
        System.out.print(prompt);
        return scanner.nextInt();
    }
    public static void main(String[] args) {
        int num_storage = 0; // Counter for user input to be added with.
        int user_intput = -1; // Set to negative one so the loop won't end immediately.
        while (user_intput != 0) { // While the user doesn't input 0,
            user_intput = getIntInput("Enter an integer: "); // Get their input
            num_storage += user_intput; // Add their input to storage.
        }
        System.out.println("Loop sum: " + num_storage); // Once 0 is inputted, print the sum.
    }
}
