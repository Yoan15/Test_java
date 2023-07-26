import java.util.Scanner;

public class UserInput {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        Scanner readerText = new Scanner(System.in); //utiliser un reader pour chaque type

        System.out.println("Please enter a text: ");
        String insertedText = readerText.nextLine();
        System.out.println("You entered the text: " + insertedText);
        System.out.println("Please enter a number: ");
        int insertedNumber = reader.nextInt();
        System.out.println("You have entered the number: " + insertedNumber);
        System.out.println("Please enter a double number: ");
        double insertedDouble = reader.nextDouble();
        System.out.println("You have entered the double number: " + insertedDouble);

        System.out.println("Please enter a text: ");
        String insertedText2 = readerText.nextLine();
        System.out.println("You entered the text: " + insertedText2);

        System.out.println("Please enter a float number: ");
        float insertedFloat = reader.nextFloat();
        System.out.println("You have entered the float number: " + insertedFloat);
        System.out.println("Please provide a long number: ");
        long longNumber = reader.nextLong();
        System.out.println("You entered the long number: " + longNumber);
        System.out.println("Please enter a boolean: ");
        boolean myBoolean = reader.nextBoolean();
        System.out.println("You have entered a boolean: " + myBoolean);
        System.out.println("Please enter a char value: ");
        char insertedChar = readerText.next().charAt(0); //return the first character of a word
        System.out.println("You have entered the char: " + insertedChar);

    }
}
