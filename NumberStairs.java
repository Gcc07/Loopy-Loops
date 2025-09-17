
public class NumberStairs {

    public static void main(String[] args) {
        String line_print = "";

        for (int i = 0; i <= 11; i++) { // Go through 10 iterations
            for (int n = 1; n < i; n++) {
                line_print += n;
            }
            System.out.println(line_print);
            line_print = "";
        
        }
    }
}

/*  This program is relatively simple. I started an inital for loop which determines the number of rows,
And a secondary loop that determines the content within the row (stored within a string.) The content within the  
row will always be based off of the current iteration of the first loop. EX: Row 1 has 1 number 1, Row 2 has 2 
numbers, 1 and 2 because there are two rows, and so on.
*/