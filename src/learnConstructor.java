
public class learnConstructor {

	
	public learnConstructor() {
		System.out.println("I am constructor");
		
	}
	

	public learnConstructor(int a) {
		System.out.println("I am parameter constructor");
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		learnConstructor lc = new learnConstructor();
		learnConstructor lcp = new learnConstructor(4);

	}

}
