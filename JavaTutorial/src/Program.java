import library.*;

public class Program {

	public static void main(String[] args) {
		
		GermanShepherd gs = new GermanShepherd("King", "Woof", 2);
		gs.birthday();


		Collie col = new Collie("Lassie","Hello", 50);
		//Dog[] dogs = new Dog[] {gs, col};
		IBirthday[] dogs = new IBirthday[2];
		dogs[0]= gs;
		dogs[1] = col;
		for(IBirthday dog: dogs) {
				System.out.printf("The dogs birthday:");
				dog.birthday();
		 
		
	
	
				Mathematics math = new Mathematics();
				int a = 12;
				int b = 3;
			
			System.out.printf("add(%d,%d)= %d\n", a,b,math.add(a,b));
			System.out.printf("sub(%d,%d)=%d\n",a,b, math.sub(a,b));
			System.out.printf("mult(%d,%d)= %d\n",a,b, math.mult(a,b));
			System.out.printf("div(%d,%d)= %d\n",a,b,math.div(a,b));
			System.out.printf("mod(%d,%d)= %d\n",a,b,math.mod(a,b));
			System.out.printf("pow(%d,%d)=%d\n",a,b, math.pow(a,b));
			
	
	}	
	
	}
}
