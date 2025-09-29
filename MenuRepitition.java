import java.time.LocalDateTime;
import java.util.Scanner;

public class MenuRepitition {
    public static Scanner scanner = new Scanner(System.in);
    
    public static String getInput(String prompt) {
        System.out.print(prompt);
        return scanner.nextLine();
    }
    public static int getIntInput(String prompt) {
        System.out.print(prompt);
        int value = scanner.nextInt();
        scanner.nextLine();
        return value;
    }
    

    public static void main(String[] args) {
        String user_input = "";
        do { // While input isn't three
            System.out.println("1: Say Hello \n2: Display Time\n3: Exit"); // UI questions
            user_input = getInput("Choice: "); // User input
            if (user_input.equals("1")) { // If input is 1:
                System.out.println("Hello!"); // Say hello.
            }
            else if (user_input.equals("2")) { // If the input is 2, print the time.
                LocalDateTime time = LocalDateTime.now();
                System.out.println(time);
            }
        } while (!user_input.equals("3"));
        System.out.println("Exited.");
        
    }
}
