import java.util.Scanner;
public class EvenOdd
{
    public static void main(String[] args)
    {
        int a;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter first number:");
        a=s.nextInt();
        if(a%2==0)
        {
            System.out.println("Number is Even");
        }
        else
        {
            System.out.println("Number is Odd");
        }
    }
}