import java.util.Scanner;

public class Pattern {
    public static void pyramid(int n) {
        int x = 1;
        while (x <= n) {
            for (int j = n; j > x; j--) {
                System.out.print(" ");
            }
            for (int k = x; k > 1; k--) {
                System.out.print(k);
            }
            for (int i = 1; i <= x; i++) {
                System.out.print(i);
            }
            System.out.println();
            x++;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();
        pyramid(n);
    }
}
