//1. Write a Program to Check Vowel or Consonant
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Check Vowel or Consonant");
        System.out.println("Enter the letter to check vowel or consonant");
        Scanner a= new Scanner(System.in);
        char c=a.next().charAt(0);
        //char c='a';
        if(c=='a' || c=='u' || c=='o' || c=='i' || c=='e' || c=='A' || c=='O' || c=='U' || c=='E' || c=='I')
        {
            System.out.println("It is vowel");
        }
        else {
            System.out.println("It is consonant");
        }

    }
}