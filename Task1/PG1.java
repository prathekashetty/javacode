import java.util.Scanner;
class PG1{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		People people = new People();
		
		boolean adm=people.addmission();
	        System.out.println(adm);
		boolean vac=people.vaccancy();
	         System.out.println(vac); 
		
		System.out.println("");
		System.out.println("Enter food type: ");
		String type = scanner.nextLine();
		System.out.println(people.food(type));
		
		System.out.println("");
		System.out.println("Enter id:");
		people.id=scanner.nextByte();
		System.out.println("Enter name:");
		people.name=scanner.next();
		System.out.println("Enter email:");
		people.email=scanner.next();
		System.out.println("Enter address:");
		people.address=scanner.next();
		System.out.println("Enter website:");
		people.website=scanner.next();
		System.out.println("Enter type:");
		people.type=scanner.next();
		System.out.println("Enter contact number:");
		people.contact=scanner.nextLong();
		
		System.out.println("");
		System.out.println("Id:"+people.id );
		System.out.println("Name:"+people.name);
		System.out.println("Email:"+people.email);
		System.out.println("Address:"+people.address);
		System.out.println("Website:"+people.website);
		System.out.println("Type:"+people.type);
		System.out.println("Contact number:"+people.contact);
		
	}
}