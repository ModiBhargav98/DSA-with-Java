import java.util.*;

public class variables {
    public static void main(String[] args) {

        // Primitive Data types
        // ex : byte , short , int , long , float , double ,boolean , char

        // Non primitive types
        // ex : interface , class , array , object ,String

        // printLn meaning is print any value new line
        // \n means yoy print ny value in new line
        System.out.println("test");

        // print meaning is print any value not new line
        System.out.print("current line\n");

        // define variables with data types in java
        String name = "bhargav Modi";
        double price = 25.50;
        int age = 26;

        // you can override the age and name value based on below example
        age = 28;
        name = "meet modi";
        System.err.println(name);
        System.out.println(price);
        System.out.println(age);

        // note : always calculation work left to right first priority is */% +-
        // // if any a and b value is bracket ex: (a * b) / (a + b ) = correct answer
        // but a * b / a +b = incorrect answer

        // get user input and return the answer

        Scanner sc = new Scanner(System.in);
        String userName = sc.next(); // if user write a bhargav modi then next is print only for bhargav beacuse
                                     // method didn't understand space
        String newUserName = sc.nextLine(); // if use this function then print full answer with space
        // nextInt()
        // nextFloat()
        System.out.println(userName);
        System.out.println(newUserName);

    }
}
