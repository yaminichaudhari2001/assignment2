//1. Write a Program for the sum of n natural numbers eg. Input N=5 output 1+2+3+4+5
public class Main {
    public static void main(String[] args) {
        int i, num = 10, sum = 0;

        for(i = 1; i <= num; ++i)
        {

            sum = sum + i;
        }

        System.out.println("Sum of First "+num+" Natural Numbers is = " + sum);
    }
}
