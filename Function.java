package Daily_Assignment;

import java.util.Scanner;

public class Function {

	public static void main(String[] args)
	{
		Function obj=new Function();
		obj.accept();
		
	}
	public void accept()
	{
		Scanner sc=new Scanner(System.in);
		
		int num1,num2,facto=1;
		System.out.println("Enter the Numbers :");
		num1=sc.nextInt();
		num2=sc.nextInt();
		logical(num1,num2);
		arith(num1,num2);
		reverse(num1);
		swapping(num1,num2);
		swapWithout(num1,num2);
		facto=factorial(num1,facto);
		sumOfDigit(facto);
	
	}
	
	public void logical(int p,int q)
	{
		System.out.println("\n Logical Operations:");
		
		System.out.println("\n AND Operator"); 
	    System.out.println((p > q) && (q > p)); 
	    System.out.println((p > q) && (q < p));  
       	   
	    System.out.println("\n OR Operator");  
	    System.out.println((p < q) || (q > p));  
	    System.out.println((p > q) || (q < p));  
	    System.out.println((p < q) || (q < p));  

	    System.out.println("\n NOT Operator"); 
	    System.out.println(!(p == q));  
	    System.out.println(!(p > q));
	    System.out.println(!(p < q));  
	    
	}
	
	public void arith(int n1,int n2)
	{
		int s;
		System.out.println("\n Arithmetic Operations of digit is:");
		s=n1+n2;
		System.out.println("\n Addition of digit is :"+s);
		s=n1-n2;
		System.out.println("Subtraction of digit is:"+s);
		s=n1*n2;
		System.out.println("Multiplication of digit is:"+s);
		s=n1/n2;
		System.out.println("Division of digit is:"+s);
		
	}
	
	public void reverse(int num)
	{
		int rev=0;
		System.out.println("\n Reverse Number:");
		while(num != 0)   
		{  
		int remainder = num % 10;  
		rev = rev * 10 + remainder;  
		num = num/10;  
		} 
		System.out.println("The reverse of the given number is: " + rev);
	}
	
	public void swapping(int a,int b)
	{
		int temp=0;
		System.out.println("\n Swap The Number:");
		System.out.println("Before swapping numbers: "+a +"  "+ b);  
		temp=a;
		a=b;
		b=temp;
		System.out.println("After swapping numbers: "+a +"  "+ b); 
	}
	
	public void swapWithout(int y,int z)
	{
		System.out.println("\n Swapping without third Number:");
		System.out.println("Before swapping numbers: "+y +"  "+ z);
		y=y+z;
		z=y-z;
		y=y-z;
		System.out.println("After swapping numbers: "+y +"  "+ z);

	}
	
	public int factorial(int num,int fact)
	{
		System.out.println("\n Factorial Number");
	
		while(num>=1)
		{
		fact=fact*num;						 
		num--;
		}
		System.out.println("The factorial is ="+fact);
		return fact;
		
	}
	
	public void sumOfDigit(int number)
	{
		System.out.println("\n Sum of digit is");
		int digit, sum=0;
		while(number!=0)
		{
			digit=number%10;   
			sum=sum+digit;
			number=number/10;
		}
		System.out.println("Sum of digit is " +sum);
		
	}

}