class Mobile
{
   String brand;
   byte ram;
   String type;
   Bettry bettry;
   
   Mobile(String brand,byte ram,String type,Bettry bettry)
   {
	  this.brand=brand; 
	  this.ram=ram;
	  this.type=type;
	  this.bettry=bettry;
   }
   
   void getDetails()
   {
	  System.out.println(brand +"\t" + ram + "\t" + type +"\t" + bettry.getDetails()); 
   }




}