///WAP for thread using Thread class and display the Fibonacci series ///

package Daily_Assignment;

public class fibonacci extends Thread
{
	public static void main(String[] args) 
	{
	fibonacci ob=new fibonacci();
	ob.start();
	fibonacci ob1=new fibonacci();
	ob1.start();
	}
	public void run()
	{
		int n = 10, firstTerm = 0, secondTerm = 1;
	    System.out.println("Fibonacci Series till " + n + " terms:");

	    for (int i = 1; i <= n; ++i) 
	    {
	      System.out.print(firstTerm + ", ");
	      int nextTerm = firstTerm + secondTerm;
	      firstTerm = secondTerm;
	      secondTerm = nextTerm;
	    }
	}
}
