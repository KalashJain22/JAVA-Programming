import java.util.Scanner;

public class Logical {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter your age: ");
        int age = input.nextInt();
        System.out.print("Are you a female? (true/false): ");
        boolean isfemale = input.nextBoolean();
        if(age < 5) {
            System.out.println("You got 75% discount");
        } else if(isfemale) {
            System.out.println("You got 50% discount");
        } else if(age > 60 && !isfemale) {
            System.out.println("You got 30% discount");
        } else {
            System.out.println("you got no discount");
        }
    }
}