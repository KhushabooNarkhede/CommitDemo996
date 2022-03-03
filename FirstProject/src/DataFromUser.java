import java.util.Scanner;

public class DataFromUser
{
	public static void main(String[] args)
	{
		String name;
		int age;
		
		System.out.println("Enter Name and Age:");
		
		Scanner sc=new Scanner(System.in);
		name=sc.next();//reading string from console 
		age=sc.nextInt();//reading the value from console
		
		System.out.println("Name is "+name);
		System.out.println("Age is "+age);
		sc.close();
	}
}
