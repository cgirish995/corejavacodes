

public class Baby {

	
	//Instance or fields
	String nameOfBaby;
	String skincolor;
	int age;
	
	
	void cute() {
		System.out.println("Baby is looking very cute");
	}
	
	void Sleeping() {
		System.out.println("Baby is Sleeping");
	}
	
	void Walking() {
		System.out.println("Baby is Walking");
	}
	
	
	public static void main(String[] args) {
		
		
		Baby boy= new Baby();
		
		boy.nameOfBaby="Ganesh";
		boy.skincolor="White";
		boy.age=2;
		
		System.out.println(boy.nameOfBaby);
		System.out.println(boy.skincolor);
		System.out.println(boy.age);
		
		System.out.println("\n");
		
		boy.cute();
		boy.Sleeping();
		boy.Walking();
		
		System.out.println("\n");
		
		Baby girl = new Baby();
		girl.nameOfBaby="suma";
		girl.skincolor="white";
		girl.age=4;
		
		System.out.println("\n");
		
		System.out.println(girl.nameOfBaby);
		System.out.println(girl.skincolor);
		System.out.println(girl.age);
		
		
		girl.cute();
		girl.Sleeping();
		girl.Walking();
		
		
		
	}

}
