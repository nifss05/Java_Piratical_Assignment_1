package piratical_Assigment2;

public class StaticPg1 {
	
	static int count =0;
	public StaticPg1() 
	{
		count++;
	}
	
	static int rcount()
	{
		return count;
	}
	static void displayCount()
	{
		System.out.println("Number of instances are :"+count);
	}

}

class demo
{
	public static void main(String args[])
	{
		
		StaticPg1 obj1 = new StaticPg1();
		StaticPg1 obj2 = new StaticPg1();
		StaticPg1 obj3 = new StaticPg1();	
		StaticPg1.displayCount();
	}
}