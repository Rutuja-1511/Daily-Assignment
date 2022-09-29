package Daily_Assignment;

import java.util.Scanner;

public class multiplication_table {

	public static void main(String[] args) {


	multiplication_table obj = new multiplication_table();
     obj.mul1();
     

}
	public void mul1() {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter number:");
		int n = s.nextInt();
		for (int i = 1; i <= 10; i++) {
			System.out.println(n + " * " + i + " = " + n * i);
		}
	}

	

}