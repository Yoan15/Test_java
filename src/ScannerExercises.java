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
           Scanner sc2 = new Scanner(System.in);
           System.out.println("Welcome to the system, How old are you?");
           int age = sc2.nextInt();
           System.out.println("Oh I see. You're " + age + " years old");
           //Ou sinon affichage de cette manière :
           //System.out.printf("Oh I see. You're %d years old", age);

/*         3.Write a program that asks the user his or her sex, by specifying only the values.
           M or F should be entered in the console.
           Store the user's response in a specific variable
           and print the text "You picked *response*."*/
           Scanner sc3 = new Scanner(System.in);
           System.out.println("What is your gender? (M or F)");
           char gender = sc3.next().charAt(0);
           System.out.println("You picked " + gender);
           //ou encore de cette manière pour l'affichage du résultat
           //System.out.printf("You picked %c", gender);

/*         4.The user must enter 3 numbers. Save the specific numbers in 3 variables.
           Print their sum, differences, multiplications, divisions and average on different rows.
           The format should be "The X is equal to Y",
           where X represents the sum, dif, multiplication, division and average,
           and Y represents the result.*/
           Scanner sc4 = new Scanner(System.in);
           System.out.println("What is your first number?");
           int n1 = sc4.nextInt();
           System.out.println("What is your second number?");
           int n2 = sc4.nextInt();
           System.out.println("What is your third number?");
           int n3 = sc4.nextInt();

           int sum = n1 + n2 + n3;
           int dif = n1 - n2 - n3;
           int multiplication = n1 * n2 * n3;
           double division = n1/n2/n3;
           double avg = sum/3;

           System.out.printf("The sum is equal to %d \n The dif is equal to %d \n The mul is equal to %d \n The div is equal to %f \n The avg is equal to %f \n", sum, dif, multiplication, division, avg);

/*         5.Write a program that asks the user to enter the current temperature in Celsius degrees,
           and prints the result in Fahrenheit degrees. (search for the formula on Google)*/
           Scanner sc5 = new Scanner(System.in);
           System.out.println("Please enter the temperature (in Celsius): ");
           double temp = sc5.nextDouble();
           double fahrenheit = (temp * 9/5) + 32;
           System.out.println("The temp in Fahrenheit is " + fahrenheit);
           // ou
           System.out.printf("The temp in Fahrenheit is %f", fahrenheit);
    }
}
