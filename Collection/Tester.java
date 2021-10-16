import java.util.ArrayList;
import java.util.LinkedList;

public class Tester {

	public static void main(String[] args) {
	
      System.out.println("hhhhhhh");
      ArrayList arrayList=new ArrayList();
      arrayList.add("hello");
      arrayList.add(2344l);
      
      System.out.println(arrayList.get(1));
      
      for (Object object : arrayList) {
    	  System.out.println(object);
	}
      System.out.println("end");
      
      
	}

}


