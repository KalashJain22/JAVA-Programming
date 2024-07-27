package kalash.jain.exception;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        a();
    }

    private static void a() {
        b();
    }
    private static void b() {
        c();
    }
    private static void c() {
        d();
    }
    private static void d() {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter first number: ");
        int first = input.nextInt();
        System.out.print("Now! Please enter second number: ");
        int second = input.nextInt();

        try {
            int[] a = new int[5];
            System.out.printf("Result is %d", a[6]);
            a[6] = first / second;
            System.out.printf("Result is %d", a[6]);
        } catch (ArithmeticException exception) {
            System.out.printf("%s, enter valid value\n", exception.getMessage());
        } catch(Throwable th) {
            System.out.println("General exception");
            throw th;
        } finally {
            System.out.println("I am in finally");
        }
    }
}
