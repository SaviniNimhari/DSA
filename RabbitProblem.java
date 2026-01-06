import java.util.Scanner;

public class RabbitProblem {

    public static int rabbitPairs(int months) {
        if (months == 0)
            return 0;
        if (months == 1)
            return 1;

        int prev2 = 0, prev1 = 1; // Month 0 = 0, Month 1 = 1
        int current = 0;

        for (int i = 2; i <= months; i++) {
            current = prev1 + prev2;
            prev2 = prev1;
            prev1 = current;
        }

        return current;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of months: ");
        int months = sc.nextInt();

        System.out.println("Rabbit pairs after " + months + " months: " 
                            + rabbitPairs(months));
    }
}
