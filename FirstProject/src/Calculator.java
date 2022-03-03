public class Calculator 
{
	int x,y,z;
	
	void setValues()
	{
		x=20;
		y=30;
	}
	void addNums() 
	{
		z=x+y;
	}
	void display()
	{
		System.out.println("Result is "+ z);
	}	
	public static void main(String []args)
	{
		Calculator cal=new Calculator();
		cal.setValues();
		cal.addNums();
		cal.display();
	}
}