public class VariablesExercises {

    public static void main(String[] args) {
        //1.Declare a variable of type character and initialize it with the value *
        char star = '*';

        //2.Declare a variable of type __ (decide which type) and initialize it with the value 3.14
        float myFloatNumber = 3.14F;
        double myDoubleNumber = 3.14;

        //3.Declare a variable of type Boolean and initialize it with whichever value you want
        boolean myBool = false;

        //4.Print all variables on the same line and on different lines
        System.out.print(star);
        System.out.print(myFloatNumber);
        System.out.print(myDoubleNumber);
        System.out.print(myBool);

        System.out.println(star);
        System.out.println(myFloatNumber);
        System.out.println(myDoubleNumber);
        System.out.println(myBool);

        /* 5.Declare two numbers and initialize them. Print on the console their sum, difference,
        multiplication and division */
        int myFirstNumber = 10;
        int mySecondNumber = 5;

        System.out.println("Sum = " + (myFirstNumber + mySecondNumber));
        System.out.println("Diff = " + (myFirstNumber - mySecondNumber));
        System.out.println("Multiplication = " + (myFirstNumber * mySecondNumber));
        System.out.println("Division = " + (myFirstNumber / mySecondNumber));
    }
}
