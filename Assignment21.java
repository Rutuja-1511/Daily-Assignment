package Daily_Assignment;

import java.util.Scanner;

public class Assignment21 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int menu_item,menu1,i_price=0;
		char ans;
		String i_name="";
		Scanner sc=new Scanner(System.in);
		do
		{
			System.out.println("Menu:\n1:Starters \n2:Main course \n3:Deserts");
			menu_item=sc.nextInt();
			switch(menu_item)
			{
			case 1:
				System.out.println("1:item 1 \t\t 120Rs.");
				System.out.println("2:Item2 \t\t 100Rs.");
				System.out.println("3:Item3 \t\t 80Rs.");
				menu1=sc.nextInt();
				switch(menu1)
				{
				case 1:
					i_price+=120;
					i_name+="\nSItem1";
					break;
				case 2:
					i_price+=100;
					i_name+="\nSItem2";
					break;
				case 3:
					i_price+=80;
					i_name+="\nSItem3";
					break;
				default:
					System.out.println("Invalid choice");
						
				}
				break;
			case 2:
				System.out.println("1:Item1");
				System.out.println("2:Item2");
				System.out.println("3:Item3");
				menu1=sc.nextInt();
				switch(menu1)
				{
				case 1:
					i_price+=120;
					i_name+="\nMItem1";
					break;
				case 2:
					i_price+=100;
					i_name+="\nMItem2";
					break;
				case 3:
					i_price+=80;
					i_name+="\nMItem3";
					break;
				default:
					System.out.println("Invalid choice");
						
				}
				break;
			case 3:
				System.out.println("1:Item1");
				System.out.println("2:Item2");
				System.out.println("3:Item3");
				menu1=sc.nextInt();
				switch(menu1)
				{
				case 1:
					i_price+=120;
					i_name+="\nDItem1";
					break;
				case 2:
					i_price+=100;
					i_name+="\nDItem2";
					break;
				case 3:
					i_price+=80;
					i_name+="\nDItem3";
					break;
				default:
					System.out.println("Invalid choice");
						
				}
				break;
			
			}
			System.out.println("Do you want to addd another item y/n");
			ans=sc.next().charAt(0);
		}
		while(ans=='Y'||ans=='y');
		System.out.println("Thanks for coming");
		System.out.println("The Food Items ARE:\n"+i_name);
		System.out.println("The Total bill amount is:"+i_price);
	}

}