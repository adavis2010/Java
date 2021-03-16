package library;

public class GermanShepherd extends Dog implements IBirthday { // inheritance (extends designates class to be inherited)
	
	public void birthday(){
		//add the body to increment of the age of the dog by 1
		System.out.println ("Prev age is " + getAge());
		setAge(getAge() + 1);
		System.out.println ("Current age is " + getAge());
	}
	
	
	public GermanShepherd(String name, String bark, int age) {
		super(name,bark,age);
	}
	
	
	public GermanShepherd() {
		super(); //calling dogs defaults constructor
		}
	
	
	}

