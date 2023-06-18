/* 3. Write a program Quadratic.java to find the roots of the equation a*x*x + b*x + c.
Since the equation is x*x, hence there are 2 roots. The 2 roots of the equation can be found
using a formula delta = b*b - 4*a*c
Root 1 of x = (-b + sqrt(delta))/(2*a)
Root 2 of x = (-b - sqrt(delta))/(2*a)
Take a, b, and c as input values to find the roots of x.*/
package equation.quadratic;
import java.util.Scanner;
public class Quadratic {
    public static double Delta(double a , double b , double c)
    {
        double delta = (b*b) - (4*a*c);
        return Math.sqrt(delta);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the value of a=");
        double a = input.nextDouble();
        System.out.print("Enter the value of b=");
        double b = input.nextDouble();
        System.out.print("Enter the value of c=");
        double c = input.nextDouble();
        double d = b * b - 4.0 * a * c;
        if (d > 0.0) {
            double Root1=((-b+Delta(a, b,c))/2*a);
            double Root2=((-b-Delta(a, b,c))/2*a);
            System.out.println("The roots are " + Root1 + " and " + Root2);

        } else {
            System.out.println("Roots are not real.");
        }
    }

}
