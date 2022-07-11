import java.text.SimpleDateFormat;
import java.util.Date;

public class learnDate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Date d = new Date();
		d.toString();
		System.out.println(d);

		SimpleDateFormat sdf = new SimpleDateFormat("M/d/yyyy");
		System.out.println(sdf.format(d)); 
		
	} 

}
