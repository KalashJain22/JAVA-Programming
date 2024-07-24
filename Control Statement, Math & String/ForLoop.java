public class ForLoop {
    public static void main(String[] args) {
        for(int i = 1; i <= 100; i++) {
            System.out.print(i + "\t");
        }

        System.out.println("\n");
        for(int j = 1; j <= 100; j += 2) {
            System.out.print(j + "\t");
        }
    }
}