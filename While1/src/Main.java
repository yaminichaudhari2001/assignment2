// Write a Program for the sum of n natural numbers eg. Input N=5 output 1+2+3+4+5
public class Main {
    public static void main(String[] args) {

        int num = 5;
        int i=0,sum=0;

        while( i <= num)
        {

            sum = sum + i;
            i++;
        }

        System.out.println("Sum of First "+num+" Natural Numbers is = " + sum);

    }
}