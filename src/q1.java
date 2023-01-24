import java.util.Arrays;
import java.util.Scanner;

public class q1 {
    public static void main(String[] args) {
      //  Using Scanner create an array of integer values. After the array is created,
        //  calculate the sum of all stored elements in that array
        Scanner scanner=new Scanner(System.in);
        int [] numbers=new int[6];
        numbers [0]=scanner.nextInt();
        numbers [1]=scanner.nextInt();
        numbers [2]=scanner.nextInt();
        numbers [3]=scanner.nextInt();
        numbers [4]=scanner.nextInt();
        numbers [5]=scanner.nextInt();
        int sum=0;
        for (int i = 0; i < numbers.length; i++) {
           sum+=numbers[i];

        } System.out.println(sum);

    }
}
