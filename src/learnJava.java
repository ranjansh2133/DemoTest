
public class learnJava {

	public static void main(String[] args) {
		// under this code will run
		
		// define variable using type
		int num = 5;
		String web = "ranjan";
		boolean ran = true;
		
		//Arrays
		int[] name = new int[3];
		name[0]= 1 ;
		name[1]= 2;
		name[2]= 3;
		
		int[] age = {1,2,3};
		//System.out.println(age[1]);
		
		// for loop
		for(int i = 0; i< name.length; i++)
		{
			System.out.println(name[i]);
		}
	
		String [] love = {"ranjan", "dharti", "sharma"};
		
		for (int i = 0; i < love.length; i++)
		{
			System.out.println(love[i]);
		}
		
		for (String s : love) {
			System.out.println(s);
		}
		
	}
}
