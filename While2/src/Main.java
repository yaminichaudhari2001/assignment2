//Write a Program to reverse the integer numbe
public class Main {
    public static void main(String[] args) {

        int num = 123, rev = 0,rem;
        int a=num;
        while(num != 0)
        {
             rem = num % 10;
            rev = rev * 10 + rem;
            num = num/10;
        }
        System.out.println("The reverse of the number "+a+" is: " + rev);
    }
}
