public class loops {
    // A loop is used for executing a block of statements repeatedly until a
    // particular condition is satisfied. A loop consists of an initialization
    // statement, a test condition and an increment statement.

    public static void main(String[] args) {

        // For Loop The syntax of the for loop is:

        // for(initialization;condition;update)
        // {
        // // body of-loop
        // }

        for (int i = 1; i <= 20; i++) {
            System.out.println(i);
        }

        // While Loop The syntax for while loop is:
        // while (condition) {
        // // body of the loop
        // }

        int j = 0;
        while (j <= 20) {
            System.out.println(j);
            j++;
        }

        // Do-While Loop The syntax for the do-while loop is:
        // do {
        // // body of loop;
        // } while (condition);

        int n = 0;
        do {
            System.out.println(n);
            n++;
        } while (n < 20);
    }
}
