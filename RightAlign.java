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
        int num_of_levels = getIntInput("Enter an integer: "); // User Input
        String user_char_input = getInput("Enter a character: "); // User Input
        String line_storage = ""; // Stores the output of each line, reset after println statement
        for (int i = 0; i < num_of_levels + 1 ; i++) { // Loop for the number of determined rows
            int num_of_spaces = 0; // stores how many " " (spaces) there are within a row
            for (int r = 0; r < num_of_levels - i; r++) { // Loop that determines how many spaces will be within a row.
                line_storage += " "; // Add a space to the storage
                num_of_spaces += 1; // Add 1 to the counter for how many spaces are in storage
            }
            for (int v = 0; v < num_of_levels - num_of_spaces; v++) { // Third loop for printing the character. 
                // The above line is the following logic: How many characters in a line, minus how many spaces. 
                line_storage += user_char_input; // For all remaining spots in storage, fill with characters.
            }
            System.out.println(line_storage); // Print line storage.
            line_storage = ""; // Reset, so the next big loop can happen again.
        }
    }
}
