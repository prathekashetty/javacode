class Tester
{
  public static void main(String []args)
  {
     Car car =new Car();
	 car.drive();
	 car.toTravel();
	 car.getCompany();
	
	 Vehical vehical=new Vehical();
	 vehical.toTravel();
	 vehical.getCompany();
	 
	 //upcasting
	 AutoMobile autoMobile=new Gears();
	 autoMobile.getCompany();
	 
	 //downcasting
	 Gears gears=(Gears)autoMobile;
	 gears.getCompany();
	 
  }


}