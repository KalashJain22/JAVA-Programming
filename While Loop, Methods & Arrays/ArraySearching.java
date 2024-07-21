import java.util.Scanner;

public class ArraySearching {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] arr = {54, 95, 35, 73, 61, 24, 42, 76, 28, 41};
        System.out.println("Welcome to Array Searching");
        System.out.print("Enter the number you want to serch: ");
        int num = input.nextInt();

        if(isFound(arr, num)) {
            System.out.println("Your number is found");
        } else {
            System.out.println("Your number is not found");
        }
        
    }

    public static boolean isFound(int[] arr, int num) {
        int index = 0;
        while(index < arr.length) {
            if(arr[index] == num) {
                return true;
            }
            index++;
        }
        return false;
    }
}