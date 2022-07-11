import java.util.ArrayList;

public class learnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String [] love = {"ranjan", "Dharti", "Sharma"};
		
		for (int i = 0; i<love.length; i++)
			
		{
			if (love[i] == "ranjan")
			{
				System.out.println(love[i]);
				break;
			}
			else {
				System.out.println("Not found");
			}
		}
		
		// create object of class
		ArrayList<String> a = new ArrayList<String>();
		a.add("Ranjan");
		a.add("Sejal");
		
	}

}
