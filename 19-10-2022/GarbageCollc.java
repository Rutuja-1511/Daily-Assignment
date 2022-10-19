package Daily_Assignment;


import java.util.Scanner;

public class GarbageCollc 
{

	public static void main(String[] args) 
	{
		GarbageCollc ob=new GarbageCollc();
		ob.greaterNo();
		System.gc();
	}
	
	public void greaterNo()
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter two Numbers :");
		int num1=sc.nextInt();
		int num2=sc.nextInt();
   
         	if(num1 > num2)
         	{
         		System.out.println("Greater Number is : " + num1);
         	}
         	else
         	System.out.println("Greatest Number is : " + num2);
	}
	
}