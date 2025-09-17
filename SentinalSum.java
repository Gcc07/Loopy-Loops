import java.util.Scanner;

public class SentinalSum {
    public static Scanner scanner = new Scanner(System.in);
    public static int getIntInput(String prompt) {
        System.out.print(prompt);
        return scanner.nextInt();
    }
    public static void main(String[] args) {
        int num_storage = 0;
        int user_intput = -1;
        while (user_intput != 0) {
            user_intput = getIntInput("Enter an integer: ");
            num_storage += user_intput;
        }
        System.out.println("Loop sum: " + num_storage);
    }
}
