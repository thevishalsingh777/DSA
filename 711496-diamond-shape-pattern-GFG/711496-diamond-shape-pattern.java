import java.util.Scanner;

class GFG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // // code here
        for(int row = 1; row <= n; row++){
            for(int col = 1; col <= n-row; col++){
                System.out.print(" ");
            }
            for(int k = 1; k <= row; k++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int row = 1; row <= n; row++){
            for(int col = 1; col <= row - 1; col++){
                System.out.print(" ");
            }
            for(int k = 1; k <= n-row+1 ; k++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna