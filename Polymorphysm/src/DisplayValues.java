
public class DisplayValues {
	
	
	DisplayValues(){
		System.out.println("This is my No-Argument ");
	}
	
	void display(String strValues){
		System.out.println("The Receive String is:"+strValues);
	}
	
	void display(String strValues,char charValues){
		System.out.println("The Receive String is :"+strValues);
		System.out.println("The receive Char values  is :"+charValues);
	}

	void display(char charValues,int intValues){
		System.out.println("The Receive Char values  is :"+charValues);
		System.out.println("The Receive Int values is :"+intValues);
	}

	public static void main(String[] args) {
	
		//String display(String strvalue) {} //same signature but different return type is not allowed
		DisplayValues disp =new DisplayValues();
		//complile time polymorphysm
		disp.display(" Hello " + " World ");
		System.out.println("'''''''''''''''''");
		disp.display("HEllo",'b');
		disp.display('c',2);
	}

}
