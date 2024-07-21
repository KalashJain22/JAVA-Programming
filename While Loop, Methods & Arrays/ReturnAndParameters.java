import java.util.Scanner;

public class ReturnAndParameters {
    public static void main(String[] args) {
        int firstNum = read();
        int secondNum = read();
        sum(firstNum, secondNum);
    }

    public static int read() {
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter the number: ");
        int num = input.nextInt();
        return num;
    }

    public static void sum(int first, int second) {
        int sum = first + second;
        System.out.println("Sum of your no. is: " + sum);
    }
}
