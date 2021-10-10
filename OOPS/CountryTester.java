import java.util.Scanner;
class CountryTester
 { 
	  static Scanner sc;
	  Country []countrys=new Country[0];
	  public static void main(String []args)
       {
			sc =new Scanner(System.in);
			 Country []countrys;
			CountryTester ct=new CountryTester();
			String temp=null;
			do
			{
					System.out.println("Enter your choices \n save : save the new data \n get : get the data ");
					String choices=sc.nextLine();
					if(choices.equals("save"))
					{
					   ct.save();
					}
					 else if(choices.equals("get"))
					 {
						ct.getAll();
					 }
					 else
					   System.out.println("Invalid choice");
					   System.out.println("countinue press yes otherviews no");
					   temp=sc.nextLine();
					   
			}while(temp.equals("yes"));
	   }
			
		void save()
			{    
				sc =new Scanner(System.in);
				System.out.println("number of country");
				int num=sc.nextInt();
				countrys=new Country[num];
				for( int i=0; i<countrys.length;i++)
				   {
					    sc.nextLine();
						System.out.println("Enter Country Name:");
						String cname=sc.nextLine();
						 System.out.println("Enter Capital :");
						String capl=sc.nextLine();
						 System.out.println("Enter number of State:");
						byte state=sc.nextByte();
						 System.out.println("EnTer population :");
						short pop=sc.nextShort();
						System.out.println();
						sc.nextLine();
						
						  Country country =new Country();
						  country.setCountryName(cname);
						  country.setCapital(capl);
						  country.setNoOfStates(state);
						  country.setPopulation(pop);
						  countrys[i]=country;
					 }
			}
			void getAll()
			{
			  for( int i=0; i<countrys.length;i++)
			  {
				  //sc.nextLine();
				Country country =countrys[i];
				String name=country.getCountryName();
				String capital=country.getCapital();
				byte noOfStates=country.getNoOfStates();
				short population=country.getPopulation();
				System.out.println(name+"\t "+ capital +" \t"+ noOfStates +" \t"+ population);
			  }
			}
        
 

}