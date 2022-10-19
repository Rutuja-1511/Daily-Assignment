package Daily_Assignment;

import java.util.Scanner;

public class Box_Unboxing                                //public class
{

	public static void boxing()
	{
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter a number");
		int num=sc.nextInt();							          //Primitive data type
		
		System.out.println("The number is = "+num);
		
		Integer a=new Integer(num);						      
		
		System.out.println("The value is = "+a);
		
		if(a>0)  
		{  
		System.out.println("The number " + a + " is positive.");           //printing statemnt
		}  
		else if(a<0)  
		{  
		System.out.println("The number "+ a + " is negative.");  
		}  
		else  
		{  
		System.out.println("The number is zero.");  
		}
	}
	
	public static void unboxing()
	{
		Scanner sc=new Scanner(System.in);

		System.out.println("\nEnter a number");		      
		Integer obj=sc.nextInt();
		
		System.out.println("The number is = "+obj);
		
		int num=obj;								         //data inside the variable 
		
		System.out.println("The value is = "+num);
		
		if (num % 2 == 0) 
		{
			 System.out.println("Entered Number is Even.");                    //printing statement
        }
        else 
        {
        	System.out.println("Entered Number is Odd.");
        }
		
		if (num % 3 == 0) 
		{
	        	System.out.println("Number is divisible by 3.");
	    	}
		else
		{
	        	System.out.println("Number is not divisible by 3.");
	    	}
	}
	
	public static void main(String[] args) 
	{
		boxing();
		unboxing();

	}
	

}