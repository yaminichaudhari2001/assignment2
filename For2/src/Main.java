//2. Write a Program to reverse the integer number eg. Input n=231 reverse is 132
public class Main {
    public static void main(String[] args) {
        int num = 231, rev = 0,rem;
        int a=num;
        for(;num != 0;)
        {
             rem = num % 10;
            rev = rev * 10 + rem;
            num = num/10;
        }
        System.out.println("The reverse of the  number"+a+" is: " + rev);
    }


}
