import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // int num = 1;
        // while(num <= 100) {
        //     System.out.print(num + "\t");
        //     num++;
        // }

        // int count = 500;
        // while(count > 200) {
        //     System.out.print(count + "\t");
        //     count--;
        // }
        
        int i = 0;
        while(i < 5) {
            int inp = input.nextInt();
            System.out.println("number is: " + inp);
            i++;
        }
    }
}
