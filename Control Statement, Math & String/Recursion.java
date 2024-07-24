import java.util.Scanner;

public class Recursion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("PLease enter your number: ");
        int num = input.nextInt();

        long fact = factorial(num);
        System.out.println("Your factorial of " + num +" is: " + fact);
    }

    public static long factorial(int num) {
        if(num == 1) {
            return 1;
        }
        return num * factorial(num-1);
    }
}