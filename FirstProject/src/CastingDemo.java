
public class CastingDemo 
{
	public static void main(String[] args)
	{
		int x=100;
		long y=x; //Implicit Casting
		System.out.println(x +" "+y);
		
		x=(int) y;// Explicit Casting
		System.out.println(x +" "+y);
		
		char ch='A';
		int cc=ch; //Implicit casting
		System.out.println(cc);
		
		ch=(char) cc;
		System.out.println(ch);
		
		int a=50;
		double b=a;
		System.out.println(a +" "+b);
		
		double c=4.5d;
		int d=(int) c;
		System.out.println(c +" "+d);
		
	}
}
