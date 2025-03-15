import java.util.*;

public class SumOfThreeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three numbers: ");
        
        if (sc.hasNextInt()) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            System.out.println("Sum: " + (a + b + c));
        } else {
            System.out.println("Invalid input! Please enter integers.");
        }
        sc.close();
    }
}