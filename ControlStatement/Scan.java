import java.util.Scanner;

class Scan
{

  public static void main(String []args)
  {
    Scanner scanner=new Scanner(System.in);
	String userName;
	int age;
	byte number;
	double salary;
	float itemnum;
	long price;
	short id;
	boolean check;
	
	
    System.out.println("Enter username"); 
    userName = scanner.nextLine();  
    System.out.println("Enter Your Age"); 
    age = scanner.nextInt(); 
    System.out.println("Enter Number"); 
    number = scanner.nextByte();  
    System.out.println("Enter salary"); 
    salary = scanner.nextDouble();
    System.out.println("Enter itemnum"); 
    itemnum = scanner.nextFloat();  
    System.out.println("Enter price"); 
    price = scanner.nextLong(); 
    System.out.println("Enter id"); 
    id = scanner.nextShort();  
    System.out.println("Enter check"); 
    check = scanner.nextBoolean();	
    	
		
		
    System.out.println("Username is: " + userName); 
    System.out.println("Username is: " + age);
    System.out.println("Username is: " + number); 
    System.out.println("Username is: " + salary);
    System.out.println("Username is: " + itemnum); 
    System.out.println("Username is: " + price);
    System.out.println("Username is: " + id); 
    System.out.println("Username is: " + check);	
  
  }
  


}