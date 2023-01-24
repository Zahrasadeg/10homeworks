public class q4 {
    public static void main(String[] args) {
        // Create a 2D array or integer type where you will store odd and even numbers.
        // Develop a program which will identify/print the even numbers only.
        int [][] mat={{3,4,5}, {4,5,6},{2,3,7}};

            for (int i = 0; i < mat.length; i++) {
                for (int j = 0; j < mat.length; j++) {
                    if(mat[i][j]%2==0){
                        System.out.print(mat[i][j]+" ");

                }

            }System.out.println();


        }
    }
}
