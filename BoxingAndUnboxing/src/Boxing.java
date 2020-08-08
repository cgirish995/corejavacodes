
public class Boxing {

	public static void main(String[] args) {
		
		
//Wrapper Class: It is an Object representation of Primitive Data Type.

		
//Converting the Primitive Data type into objects using new Keyword is called Boxing.
		
		
		int a=10;
	//Converting into Wrapper Class
		
		Integer b = new Integer(a); //Boxing 
		System.out.println(b);
		//Integer b = new Integer(10); 
		//System.out.println(b);
		
		char c = 'A';
		Character d = new Character(c);
		System.out.println(d);
		
		
//AutoBoxing:Automatically converting the Primitive Data type into Objects.
		//Auto Boxing for Integer and Character
		Integer f=20;
		System.out.println(f);
		Character g='G';
		System.out.println(g);
		
		
		
	}

}
