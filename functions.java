import java.util.*;

public class Functions {

    // Note: function name always write in camel cases
    // function and methods both are difference we learn oops with java
    public static int printMyName(int a, int b) {
        int sum = a + b;
        return sum;
    }

    // main is function name and void is return empty return type
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(printMyName(a, b));

        // TwoDArray
        // a means rows
        // b means columns
        int[][] numbers = new int[a][b];

        // inputs
        // a means rows
        for (int i = 0; i < a; i++) {
            // b means columns
            for (int j = 0; j < b; j++) {
                numbers[i][j] = sc.nextInt();
            }
        }

        // outputs
        // a means rows
        for (int i = 0; i < a; i++) {
            // b means columns
            for (int j = 0; j < b; j++) {
                System.out.print(numbers[i][j] + "");
            }
            System.out.println();
        }

    }
}