public class Method {
    public static void main(String[] args) {
        //greetings();

        print1st();
        System.out.println();
        print2nd();
        System.out.println();
        print3rd();
        System.out.println();
    }

    public static void print1st() {
        int i = 0;
        int rows = 5;
        while(i < rows) {
            int j = 0;
            while(j <= i)
            {
                System.out.print("* ");
                j++; 
            }
            i++;
            System.out.println();
        }
    }
    public static void print2nd() {
        System.out.println("* * * * *");
        System.out.println("* * * *");
        System.out.println("* * *");
        System.out.println("* *");
        System.out.println("*");
    }
    public static void print3rd() {
        System.out.println("        *");
        System.out.println("      * *");
        System.out.println("    * * *");
        System.out.println("  * * * *");
        System.out.println("* * * * *");
    }

    public static void greetings() {
        System.out.println("Good Morning!");
    }
}