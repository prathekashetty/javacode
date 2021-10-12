import java.util.Scanner;
public class Scientist{
	static Scanner sc = new Scanner(System.in);
	private String name;
	private byte noOfExp;
	private byte age;
	private String role;
	private String type;
	private Address address = new Address();

	void setName(String name){
		this.name = name;
	}
	String getName(){
		return name;
	}

	void setNoOfExp(byte noOfExp){
		this.noOfExp = noOfExp;
	}
	byte getNoOfExp(){
		return noOfExp;
	}
	
    void setAge(byte age){
		this.age = age;
	}
	byte getAge(){
		return age;
	}
	
	void setRole(String role){
		this.role = role;
	}
	String getRole(){
		return role;
	}

	void setType(String type){
		this.type = type;
	}
	String getType(){
		return type;
	}

	void setAddress()
	{
		System.out.println("Enter House Number: ");
		short houseNum = sc.nextShort();
		sc.nextLine();
		System.out.println("Enter Area: ");
		String area = sc.nextLine();
		System.out.println("Enter City: ");
		String city = sc.nextLine();
		System.out.println("Enter State: ");
		String state = sc.nextLine();
		System.out.println("Enter Country: ");
		String country = sc.nextLine();
		System.out.println("Enter Pincode: ");
		int pincode = sc.nextInt();
		sc.nextLine();
		
		address.setHouseNum(houseNum);
		address.setArea(area);
		address.setCity(city);
		address.setState(state);
		address.setCountry(country);
		address.setPincode(pincode);
	}

	void setAddress(Address address){
		this.address = address;
	}

	Address getAddress(){
		return address;
	}
} 