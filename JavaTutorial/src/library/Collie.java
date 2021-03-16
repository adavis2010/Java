package library;

public class Collie extends Dog implements IBirthday {

	
	public Collie(String name, String bark, int age) {
		super(name, bark, age); // default constructor
	}

	@Override //annotation (like attributes in C#) they modify the source
	public void birthday() {
		// TODO Auto-generated method stub
		
		System.out.println("Happy Birthday");
		
	}
	
	
	
	
	
	
	
}
