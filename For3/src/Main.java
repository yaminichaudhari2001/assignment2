// Write a Program to find Palindrome Number
//eg. Input n=121 then after reverse output is same 121 then it is a palindrome.
//eg. Input n=321 then after reverse output is not same it's 123 then it is not a palindrome number.
public class Main {
    public static void main(String[] args) {
        System.out.println("Check number is palindrom or not");
        int num = 232, rev = 0,rem;
        int a=num;
        for(;num != 0;)
        {
            rem = num % 10;
            rev = rev * 10 + rem;
            num = num/10;
        }

        if(a==rev) {
            System.out.println("The  number " + a + " is Pallindrom ");
        }
        else {
            System.out.println("The  number " + a + " is not Pallindrom ");
        }


    }
}