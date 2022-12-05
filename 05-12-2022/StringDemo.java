package Daily_Assignment;

public class StringDemo {

	
		public static void main(String[] args) {
			StringDemo s=new StringDemo();
			s.string();
			s.stringBuffer();
		   
		  }
		
		public void string() {
			 // create a string
		    String abc = "Hello! World ";
		    System.out.println("String: " + abc);
		    
		    // get the length 
		    int length = abc.length();
		    System.out.println("Length: " + length);
		    
		    String first = "Java Programming";
		    System.out.println("First String: " + first);

		    // join two strings
		    String joinedString = abc.concat(first);
		    System.out.println("Joined String: " + joinedString);
		    
		    //Compare two Strings
		    String a = "java";
		    String b = "java";
		    String c = "java programming";

		    // compare first and second strings
		    boolean result1 = a.equals(b);
		    System.out.println("Strings first and second are equal: " + result1);

		    // compare first and third strings
		    boolean result2 = a.equals(c);
		    System.out.println("Strings first and third are equal: " + result2);
		    
		    //hash code
		    String str="";
		    System.out.println("hash code:" + a.hashCode()); 
		    System.out.println("hash code:" + abc.hashCode()); 
		    System.out.println("hash code for empty string:" + str.hashCode()); 
		    
		    //toLowerCase
		    System.out.println(abc.toLowerCase());
		    
		    //toUpperCase
		    System.out.println(c.toUpperCase());
		    
		    //replace
		    String str1="cat";
		    System.out.println(str1.replace('c','b'));
		    
		    //isEmpty
		    System.out.println("is empty " +str.isEmpty());
		    System.out.println("is empty " +str1.isEmpty());
		    
		    //charAt
		    char result =str1.charAt(0);
		    System.out.println(result);
		}
		
		public void stringBuffer()
		{
			//append
			StringBuffer sb=new StringBuffer("Hellloo ");  
			sb.append("World");  
			System.out.println(sb); 
			
			//insert
			sb.insert(3,"l");
			System.out.println(sb);
			
			//replace
			sb.replace(1,5,"i");  
			System.out.println(sb);
			
			//delete
			sb.delete(2,4);  
			System.out.println(sb);
			
			//reverse
			sb.reverse(); 
			System.out.println(sb);
			
			//capacity
			System.out.println(sb.capacity());
			sb.append("Hi , My name is Rutu ");
			System.out.println(sb.capacity());
		}
	}
