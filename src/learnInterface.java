import demo.newInterface;
import demo.testInterface;

public class learnInterface implements testInterface, newInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		testInterface la = new learnInterface();
		la.Red();
		la.Green();
		
		newInterface ni = new learnInterface();
		ni.symbol();

	}

	@Override
	public void Red() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Green() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Yellow() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void symbol() {
		// TODO Auto-generated method stub
		
	}

}
