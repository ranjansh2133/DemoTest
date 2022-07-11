
public class learnMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//method - code call again 
		
		//create object to access method in class
		learnMethod lm = new learnMethod();
		lm.getData();
		String name = lm.getData();
		
		//if dont want to call method using object then use static in method
		

	}

	// declare method
	public static String getData()
	{
		return "Ranjan";
	}
}
