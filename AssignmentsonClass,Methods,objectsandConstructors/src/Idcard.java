
public class Idcard {

	String empName;
	String idColor;
	int idCardNo;
	
	Idcard(){
		System.out.println("No Agrument Constructor");
	}
	
	public  Idcard(String inempName,String inidColor) {
		empName=inempName;
		idColor=inidColor;
	}
	
	public Idcard(String inempName,String inidColor,int inidCardno) {
		empName=inempName;
		idColor=inidColor;
		idCardNo=inidCardno;
	}
	
	void Access() {
		System.out.println("Giving the access to employee");
	}
	
	
	
	public static void main(String[] args) {
		
		Idcard access = new Idcard();
		
	System.out.println("Employee Name: " +access.empName + "color of ID" + access.idColor + "number of Id card " + access.idCardNo );
	
	access.empName="Sachin";
	access.idColor="Black";
	access.idCardNo=7896;
	
	System.out.println("Employee Name: " + access.empName + " color of ID " + access.idColor + " number of Id card " + access.idCardNo );
	
	
	Idcard scan = new Idcard(" Girish"," white");
	
	System.out.println("Employee Name: " +scan.empName + "color of ID" + scan.idColor + "number of Id card " + scan.idCardNo );
	
	
	Idcard swipe = new Idcard("Suma","white",14789);
	System.out.println("Employee Name: " +swipe.empName + "color of ID" + swipe.idColor + "number of Id card " + swipe.idCardNo );
	
	}

	
}
