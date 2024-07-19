public class Unary {
    public static void main(String[] args) {
        int x = 3;
        int y = -x;
        int z = -y;

        System.out.println(y);
        System.out.println(z + "\n");

        //int a = 3;
        // a = a + 1;
        // System.out.println(a);
        // a += 1;
        // System.out.println(a);
        
        int p = 5;
        System.out.println(p++);
        System.out.println(p);
        System.out.println(++p);
        System.out.println(p);

        int q = 7;
        System.out.println();
        System.out.println(--q);
        System.out.println(q);
        System.out.println(q--);
        System.out.println(q);
    }
}