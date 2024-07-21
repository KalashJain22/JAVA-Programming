public class TwoDArray {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        //System.out.println(arr[0].length);
        int[][] myarr = new int[5][4];
        myarr[0][0] = 9;

        int i = 0;
        while(i < arr.length) {
            int j = 0;
            while(j < arr[i].length) {
                System.out.print(arr[i][j] + " ");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}