import java.util.Scanner;

public class IfElse {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
//        System.out.println("Please enter your age : ");
//        int age = reader.nextInt();
//        if(age >= 18){
//            System.out.println("You are an adult.");
//        } else {
//            System.out.println("You are a minor.");
//        }
//        System.out.println("The program is over.");
        System.out.println("Please enter the color of the traffic light:");
        String color = reader.nextLine();
        if(color.equals("red")){
            System.out.println("We are waiting.");
        } else if (color.equals("yellow")){
            System.out.println("We are careful.");
        } else if (color.equals("green")){
            System.out.println("We can go.");
        } else {
            System.out.println("The color entered for the traffic light is not valid.");
        }
    }
}
