
public class Customer 
{
	int custId;
	String custName;
	
	void setData()
	{
		custId=1001;
		custName="Khushi";
	}
	void display()
	{
		System.out.println("Cust Id: " + custId);
		System.out.println("Cust Name: " + custName);
	}
	public static void main(String [] args)
	{
		Customer c=new Customer();
		c.setData();
		c.display();
	}
}
