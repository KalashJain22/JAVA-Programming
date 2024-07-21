public class Array {
    public static void main(String[] args) {
            // int[] myArr = new int[5];
            // myArr[0] = 54;
            // myArr[1] = 48;
            // myArr[2] = 72;
            // myArr[3] = 51;
            // myArr[4] = 81;
            int[] myArr = {54, 48, 72, 51, 91};

            // int index = 2;
            // System.out.println(myArr[0]);
            // System.out.println(myArr[1]);
            // System.out.println(myArr[index]);
            // System.out.println(myArr[3]);
            // System.out.println(myArr[4]);

            //array traversal
            int index = 0;
            while(index < myArr.length) {
                System.out.println(myArr[index]);
                index++;
            }

            String[] strArr = new String[4];
            strArr[0] = "My String";

            String[] newStrArr = {"first", "second", "third"};
            System.out.println(newStrArr.length);
    }
}