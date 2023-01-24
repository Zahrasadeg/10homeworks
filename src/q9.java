public class q9 {
    public static void main(String[] args) {
        //Maximum and minimum number in the array?
        int [] aadad={120,14,15,18,200};
        int max=0;
        for (int i = 0; i < aadad.length; i++) {
            if(aadad[i]>max){
                max=aadad[i];
            }

        }
        System.out.println("The max number is "+max);
        int min=max;

        for (int j = 0; j < aadad.length; j++) {
            if(aadad[j]<min){
                min=aadad[j];
            }

        }
        System.out.println("The min number is "+min);
    }
}
