
public class learnStatic {

	String name; // Instance variable 
	String address;
	static String gender= "Male"; // class variable
	
	public learnStatic(String name, String address) {
		System.out.println("Test");
		//this.name = name;
		
		System.out.println(gender);
		
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		learnStatic ls = new learnStatic("Ranjan", "Gujrat");
		

	}
}
