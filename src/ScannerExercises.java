import java.util.Scanner;

public class ScannerExercises {
    public static void main(String[] args) {

/*        1.Print the following text "What profession do you want to have next year?"
            The user must enter the response in the console.
            The text "Keep up the good work and next year you will be a *response*"
            will be printed in the console. */
          Scanner sc = new Scanner(System.in);
          System.out.println("What profession do you want to have next year?");
          String profession =  sc.nextLine();
          System.out.println("Keep up the good work and next year you will be a " + profession);

/*         2.Write the program that prints the following text:
           "Welcome to the system, How old are you?"
           The user will enter the response in the console, and it will be stored in a variable.
           The text "Oh I see. You're *response* years old" will be printed in the console.*/

/*         3.Write a program that asks the user his or her sex, by specifying only the values.
           M or F should be entered in the console.
           Store the user's response in a specific variable
           and print the text "You picked *response*."*/

/*         4.The user must enter 3 numbers. Save the specific numbers in 3 variables.
           Print their sum, differences, multiplications, divisions and average on different rows.
           The format should be "The X is equal to Y",
           where X represents the sum, dif, multiplication, division and average,
           and Y represents the result.*/

/*         5.*/
    }
}
