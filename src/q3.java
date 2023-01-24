public class q3 {
    public static void main(String[] args) {
        // Create a 2D array of integer values. Print the sum of all numbers.
        int[][] numbers={{1,2,3},
        {1,2,3},
                {1,2,3}};
        int sum=0;

        for (int i = 0; i <3; i++) {
            for (int j = 0; j < 3; j++) {
                sum+=numbers[i][j];

            }
            }System.out.println(sum);

        }
        }