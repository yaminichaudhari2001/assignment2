import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Artithmatic Oprator");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number a,b,c : ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int e1 = (b*c)+a;
        int e2 = (a*b)+c;
        int e3 = (a/b)+c;
        int e4 = (a%b)+c;
        System.out.println("a + b * c = "+e1);
        System.out.println("a * b + c = "+e2);
        System.out.println("a / b + c = "+e3);
        System.out.println("a % b + c = "+e4);
    }
}