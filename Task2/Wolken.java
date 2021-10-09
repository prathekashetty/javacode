class Wolken
{
  int id;
  String name;
  String emailid;
  long contactnumber;
  
  Wolken()
  {
	   System.out.println("Wolken Software works list");
  }
  Wolken(int i)
  {
	  this.id=i;
  }
  Wolken(int i,String n,String e,long c )
  {
	  this(i);
	 // this.id=i;
	  this.name=n;
	  this.emailid=e;
	  this.contactnumber=c;
  }
  void display()
   {
     System.out.println(id+" "+name+" "+emailid+" "+contactnumber);
	}  
  public static void main(String args[])
  {
	  Wolken wl=new Wolken();
	  Wolken w2=new Wolken(12,"Pratheeka","pratheeka@gmail.com",1234567890);
	 
	  w2.display();
  }
}  