public class advancePatterns {
    public static void main(String[] args) {

        // Pattern 1
        int n = 4;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= (n * 2); j++) {
                int num = (n * 2) - i;
                if (j <= i || num < j) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= (n * 2); j++) {
                int num = (n * 2) - i;
                if (j <= i || num < j) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        // output
        // * *
        // ** **
        // *** ***
        // ********
        // ********
        // *** ***
        // ** **
        // * *

        // Pattern 2
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= 9; j++) {
                int num = (n - i) + 1;
                int space = num + n;
                if (num > j || space < j) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }

        // Output
        // *****
        // *****
        // *****
        // *****

        // Pattern 3
        for (int i = 1; i <= n; i++) {
            // spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // numbers
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }

        // Output
        // 1
        // 2 2
        // 3 3 3
        // 4 4 4 4

        // Pattern 4
        for (int i = 1; i <= n; i++) {
            // spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // first part
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }
            // second part
            for (int j = 2; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }

        // Output
        // 1
        // 212
        // 32123
        // 4321234

        // Pattern 5
        for (int i = 1; i <= n; i++) {
            // spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        // lower part
        for (int i = n; i >= 1; i--) {
            // spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Output
        // *
        // ***
        // *****
        // *******
        // *******
        // *****
        // ***
        // *
    }
}
