public class ConcatenationExercises {

    public static void main(String[] args) {

        int number = 10;
        String text = "test";
        double doubleNumber = 11.1;
        float floatNumber = 11.1F;
        boolean truth = true;
        char c = '*';

        System.out.println("My variable has the value " + text);
        System.out.println("My number is " + number);
        System.out.println(doubleNumber + " is my double number");
        System.out.println(floatNumber + " is my float number");
        System.out.println("I have declared a character with the value " + c);
        System.out.printf("I have declared a String variable with the value %s", text);
        System.out.println();
        System.out.printf("I have declared a int variable with the value %d", number);
        System.out.println();
        System.out.printf("I have declared a double variable with the value %f and a string with the value %s", doubleNumber, text);
        System.out.println();
        System.out.printf("We are declaring a boolean %b", truth);
    }
}
