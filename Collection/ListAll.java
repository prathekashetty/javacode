
import java.util.*;  
class  ListAll {

	
	public static void main(String[] args)
	{
		
		List list = new ArrayList();
		list.add("Pratheeka");
		list.add(1);
		System.out.println(list);

		List list1 = new ArrayList();
        //Add List
		list1.add("Mango");
		list1.add(2);
		list1.add(3);
        //AddAll List
		list.addAll(1, list1);
		System.out.println(list);
		//Remove
		list.remove(1);
		System.out.println(list);
        
		System.out.println(list.get(3));
		//Set
		list.set(0, 5);
		System.out.println(list);
		
		 List<Integer> list2=new ArrayList<Integer>();  
		  list2.add(21);  
		  list2.add(11);  
		  list2.add(51);  
		  list2.add(1);  
		  //Sort
		  Collections.sort(list2);  
		  for(Integer number:list2)  
		    System.out.println(number); 
		  
		  
		  List<String> strList = new ArrayList<String>();           
	        strList.add("Java");  
	        strList.add("C++");  
	        //Size
	        System.out.println("Size of list:" + strList.size());  
            //Clear
	        strList.clear();
	        System.out.println("List after calling clear() method:" + strList);
	        
	        List<String> list3 = new ArrayList<String>();
	        //initialize list to strings
	        list3.add("Java");
	        list3.add("Xml");
	        list3.add("Python");
	        list3.add("Ruby");
	        list3.add("JavaScript");
	 
	        //contains
	        if(list3.contains("C")==true)
	            System.out.println("Given list contains string 'C'");
	        else if(list3.contains("Java")==true)
	        System.out.println("Given list contains string 'Java' but not string 'C'");
	         
	        //containsAll
	        List<String> myList = new ArrayList<String>();
	        myList.add("Ruby");
	        myList.add("Python");
	        if(list3.containsAll(myList)==true)
	            System.out.println("List contains strings 'Ruby' and 'Python'");
		 
	}
}


 