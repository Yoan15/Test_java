public class Operators {

    public static void main(String[] args) {

        //mathematical operators
        // + - * / %

        System.out.println(10+10);
        System.out.println(100-88);
        System.out.println(100 * 3);
        System.out.println(7/2);
        System.out.println(7%2);

        //relational operators
        System.out.println(7 == 9);
        System.out.println(7 == 7);
        System.out.println(7 != 7);
        System.out.println(7 != 9);
        System.out.println(4 + 4 < 10);
        System.out.println(8 <= 8);
        System.out.println(8 >= 8);

        //logical operators
        System.out.println(7 < 10 && 100 < 10);
        System.out.println(100 < 1000 || 9 > 100);
        System.out.println(!true);
        System.out.println(!(2 > 10));

        //assignment operators
        int number = 5;
        number++;
        number++;
        number++;
        System.out.println(number);

        int number2 = 8;
        number2--;
        System.out.println(number2);

        int number3 = 10;
        number3 += 20;
        System.out.println(number3);
        number3 += 20;
        System.out.println(number3);
    }
}
