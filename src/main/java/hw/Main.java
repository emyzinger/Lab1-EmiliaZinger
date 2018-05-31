package hw;

import java.util.Arrays;

import static hw.FizzBuzz.fizzBuzz;

public class Main {

    public static void main(final String[] args) {
        int max = 0;
        if (args.length > 0) {
            try {
                max = Integer.parseInt(args[0]);
            }
            catch (NumberFormatException e) {
                System.err.println("The argument entered must be an integer ");
                //In our case, you can use System.out.println.
                System.exit(1);
            }
                 /* Since you are trapping the error, you can exit with a 0 instead of
                 * 1. By convention, a 0 means a normal exit (no error), and a non-
                 * zero value means some type of error. But it still ends the program
                 * and returns to the OS.  So it’s more of a status message to you.*/
        }
        else{
           System.out.println("You need enter an argument");
        }
        if (max < 1){
            System.out.println("You need to enter a number more than 0");
        }
        fizzBuzz(max);
    }
}
