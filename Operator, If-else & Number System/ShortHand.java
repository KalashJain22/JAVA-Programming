import java.util.Scanner;

public class ShortHand {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a = 5;
        int x1 = input.nextInt();
        //a = a + x1;
        a += x1;

        System.out.println(a);
        int x2 = input.nextInt();
        a = a + x2;
        System.out.println(a);
        int x3 = input.nextInt();
        a = a + x3;
        System.out.println(a);
        int x4 = input.nextInt();
        a = a + x4;
        System.out.println(a);
    }
}