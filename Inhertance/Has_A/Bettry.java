class Bettry
{
  String brand;
  short capacity;
  String type;
  float price;
  
  Bettry(String brand,short capacity,String type,float price)
  {
	  this.brand=brand;
	  this.capacity=capacity;
	  this.type=type;
	  this.price=price;
	  
  }
 String  getDetails()
  {
	 return brand +"\t"+capacity+"\t"+type+"\t"+price;
	  
  }
  void getCharge()
  {
	  System.out.println("Current charge : 30%");
  }
   String getBrand()
  {
	  return brand;
  }
   short getCapacity()
  {
	  return capacity;
  }

  float getPrice()
  {
	  return price;
  }

}