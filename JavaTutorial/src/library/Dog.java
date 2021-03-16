package library;

public class Dog {

	private String name;
	public String getName() {return name;}  // reading the get name value
	public void setName(String name) {
		this.name =name;} // method(changing) that another class would pass in the name 
	
	private String bark;
	public String getBark() {return bark;}
	public void setBark(String bark) {
		this.bark = bark;
	}
	
	private int age;
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	 //add default constructor
	public Dog(String name, String bark, int age) {
		super();// points to parent class.. must be first statement in body of constructor
		this.name = name;
		this.bark = bark;
		this.age = age;
	}
	
	public Dog() { // default constructor
		super();
	}
		
	}

