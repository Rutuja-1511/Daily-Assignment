package Daily_Assignment;

// 1,2 Pattern 

import java.util.Scanner;

public class nestedloop2 {
	
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the value of row");
	int n=sc.nextInt(); 
	
	for(int i=1;i<=n;i++) {
	
		for(int j=1;j<=n-i;j++) { 
			System.out.print(" ");
		}
		for(int j=1;j<=i;j++) {
			System.out.print(j);
	
		}
		System.out.println(" ");
	}
}
}