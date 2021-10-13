
public class TaskNotFoundException extends RuntimeException {
	String msg;
	
	TaskNotFoundException(String msg){
		this.msg=msg;
				
	}
	
	@Override
	public String getMessage(){
		return msg;
	}

}
