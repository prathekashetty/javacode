class Overloadconstructors
{  
    int id;  
    String name;  
    int age; 
	
    Overloadconstructors(int i,String n)
	{  
     id = i;  
     name = n;  
    }  
    Overloadconstructors(int i,String n,int a)
	{  
     id = i;  
     name = n;  
     age=a;  
    }  
    void display()
	{
		System.out.println(id+" "+name+" "+age);
	}  
    public static void main(String args[])
	{  
    Overloadconstructors overload1 = new Overloadconstructors(111,"Rocks");  
    Overloadconstructors overload2 = new Overloadconstructors(222,"Shetty",25);  
    overload1.display();  
    overload2.display();  
   }  
}  