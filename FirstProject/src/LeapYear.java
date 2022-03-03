import java.util.Scanner;

public class LeapYear
{
    public static void main(String[] args)
    {
        int year;

        
        System.out.println("Enter the year:");
        Scanner scn = new Scanner(System.in);
        year = scn.nextInt();
 
        if (year % 100 == 0) 
        {
			if(year % 400 == 0)
			{
				System.out.println(" Leap Year");
			}
			else
			{
				System.out.println("Century Year");
			}
		} 
        else
        {
			if(year % 4 == 0)
			{
				System.out.println("Leap Year");
			}
			else 
			{
				System.out.println("Not a Leap Year!");
			}
		}
    }
}