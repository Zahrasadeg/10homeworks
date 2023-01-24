public class q5 {
    public static void main(String[] args) {
        //Create a 2D array of integers. Develop a program
        // which will calculate the sum of  even and odd numbers for that array.
        int[][]cool={{5,6,7},{8,10,12},{14,15,16}};
        int sum=0;
        for (int i = 0; i < cool.length; i++) {
            for (int j = 0; j < cool.length; j++) {

                if (cool[i][j] % 2 == 0) {
                    sum += cool[i][j];
                }
            }
        }
        System.out.println(sum);
    }
}
