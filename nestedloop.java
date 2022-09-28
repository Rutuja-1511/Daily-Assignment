package Daily_Assignment;

import java.util.Scanner;

public class nestedloop {
	
		public static void main(String[] args) {
			
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the value of row");
			int a=sc.nextInt(); 
			
			System.out.println("\n Alphabetical pattern :");
			char alp=64; 
			for(int i=1;i<=a;i++) {
				for(int j=1;j<=i;j++) {
					System.out.print((char)(alp+j)+""); 
					
				}

				System.out.println(" ");
			}
		}
}