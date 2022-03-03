import java.util.Scanner;

public class LeapYr1
{
    public static void main(String[] args)
    {
        int year;

        System.out.println("Enter the year:");
        Scanner scn = new Scanner(System.in);
        year = scn.nextInt();
 
        if((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0))
        {
				System.out.println("Leap Year");
        }
		else if (year % 100 == 0)
		{
				System.out.println("Century Year");
		}
        else
        {
				System.out.println("Not a Leap Year!");
		}
    }
}