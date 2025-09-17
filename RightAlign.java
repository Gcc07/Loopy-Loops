import java.util.Scanner;

public class RightAlign {
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
        int num_of_levels = getIntInput("Enter an integer: ");
        String user_char_input = getInput("Enter a character: ");
        String line_storage = "";
        for (int i = 0; i < num_of_levels + 1 ; i++) {
            int num_of_spaces = 0;
            for (int r = 0; r < num_of_levels - i; r++) {
                line_storage += " ";
                num_of_spaces += 1;
            }
            for (int v = 0; v < num_of_levels - num_of_spaces; v++) {
                line_storage += user_char_input;
            }
            System.out.println(line_storage);
            line_storage = "";
        }
    }
}
