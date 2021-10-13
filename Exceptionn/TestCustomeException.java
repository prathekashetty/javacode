
public class TestCustomeException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  
		String []names= {"Pratheeka","Shetty","Jayanth"};
		
		for(int i=0;i<names.length;i++)
		{
			try {
			if(!names[i].equals("Shetty"))
			{
				System.out.println("Task completed"+names[i]);
				
			}else {
                 throw new TaskNotFoundException("Task pending" + names[i]);
				
			}
			}catch(TaskNotFoundException e)
			{
				System.err.println(e.getMessage());
			}
		}
		}

}
