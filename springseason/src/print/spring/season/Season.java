//. Write a program SpringSeason.java that
// takes two int values m and d from the command line and prints true if day d of month m is
// between March 20 (m = 3, d=20) and June 20 (m =6, d = 20), false otherwise.
package print.spring.season;
import java.util.*;

public class Season {
    public static void value(int m , int d)
    {
        if(m==3)
        {
            if(d>=20 && d<=31)
            {		System.out.println("True");			}
            else
            {		System.out.println("False");			}
        }
        else if(m==4)
        {
            if(d>=1 && d<=30)
            {		System.out.println("True");			}
            else
            {		System.out.println("False");			}
        }
        else if(m==5)
        {
            if(d>=1 && d<=31)
            {		System.out.println("True");			}
            else
            {		System.out.println("False");			}
        }
        else if(m==6)
        {
            if(d>=1 && d<=20)
            {		System.out.println("True");			}
            else
            {		System.out.println("False");			}
        }
        else
        {		System.out.println("False");		}
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a Month");
        int a=scanner.nextInt();
        System.out.println("Enter a Day");
        int b=scanner.nextInt();
   
         value(a,b);

    }


}
