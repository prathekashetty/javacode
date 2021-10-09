class People{
	byte id;
	String name;
	String email;
	long contact;
	String address;
	String website;
	String type;
	
	boolean addmission(){
		System.out.println("");
		System.out.println("addmission");
		return  true;
	}
	String food(String type){
		System.out.println("");
		System.out.println("Food");
		return type;
	}
	boolean vaccancy(){
		System.out.println("");
		System.out.println("vaccancy");
		return true;
	}
}