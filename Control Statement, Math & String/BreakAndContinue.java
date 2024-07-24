public class BreakAndContinue {
    public static void main(String[] args) {
        for(int i = 1; i < 1000; i++) {
            if(i == 101) {
                break;
            }   
            System.out.print(i + "\t");
        }
        System.out.println("\nOut of loop");
        
        System.out.println();
        for(int i = 1; i <= 10; i++) {
            if(i == 5) {
                continue;
            }   
            System.out.print(i + "\t");
        }
        System.out.println("\nOut of loop");
    }
}