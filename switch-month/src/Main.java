import java.util.Scanner;

//Write a Program to print the month name for the given number
public class Main {
    public static void main(String[] args) {
        System.out.println("Enter the number and check which moth is this");
        Scanner a=new Scanner(System.in);
        int n=a.nextInt();
        switch (n){
            case 1:
                System.out.println("january");break;
            case 2:
                System.out.println("February");break;
            case 3:
                System.out.println("March");break;
            case 4:
                System.out.println("April");break;
            case 5:
                System.out.println("May");break;
            case 6:
                System.out.println("June");break;
            case 7:
                System.out.println("July");break;
            case 8:
                System.out.println("August");break;
            case 9:
                System.out.println("September");break;
            case 10:
                System.out.println("Octomber");break;
            case 11:
                System.out.println("November");break;
            case 12:
                System.out.println("December");break;
            default:
                System.out.println("Check the number their are only 12 month" );
        }
    }
}