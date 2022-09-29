package Daily_Assignment;

import java.util.Scanner;

public class array_q2 {
	
public static void main(String[] args) {
	
	int i;
	float total=0,percentage,average;
	Scanner sc=new Scanner(System.in);
	
	System.out.println("Enter the name of student :");
	String name=sc.next();
	
	System.out.println("Enter the marks of 5 sub :");
	int marks[]=new int[5];
	for(i=0;i<5;i++) {
		marks[i]=sc.nextInt();
	}
	for(i=0;i<5;i++) {
		System.out.println("Marks is :"+marks[i]);
	}
	total=marks[0]+marks[1]+marks[2]+marks[3]+marks[4];
	percentage=(total/(5*50))*100;
	
	System.out.println("the persentage of "+name+" "+"is "+percentage+"%");
	switch((int)percentage/10) {
	
	case 9:
		System.out.println("Grade :A+");
        break;
        
	case 8:
		System.out.println("Grade :A");
        break;
        
	case 7:
		System.out.println("Grade :B");
        break;
        
	case 6:
		System.out.println("Grade :C");
        break;
        
	case 5:
		System.out.println("Grade :D");
        break;
        
        default:
        	System.out.println("Fail ");
         break;

	}
}
}