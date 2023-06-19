//. Read a Number 1,10,100,1000 and display unit, ten hundred
public class Main {
    public static void main(String[] args) {
        System.out.println("Enter the number ");
        int x=100;

        if(x==1000)
        {
            System.out.println("Thousand place digit");
        }
        else if(x==100)
        {
            System.out.println("Hundred place digit");
        }
        else if(x==10)
        {
            System.out.println("Ten place digit");
        }
        else if(x==1)
        {
            System.out.println("unit place digit");
        }


    }
}
