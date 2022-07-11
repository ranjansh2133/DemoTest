
public class demoArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int abc [] = {3,6,4,2,5,1};
		int min = abc [0];
		
		for (int i=0; i<6; i++) {
			
			for (int j=0; j<5; j++) {
				if (abc [i] < min) {
					min = abc[i];
					
				}
			}
		}
		
		System.out.println(min);
	}

}
