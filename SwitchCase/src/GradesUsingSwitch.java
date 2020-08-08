
public class GradesUsingSwitch {

	public static void main(String[] args) {
		
		char grade = 'C';	
		String result=null;
	
		
		System.out.println("The input Grade is:"+ grade);
		
		switch (grade){
		
		case 'A':
			result="Your marks is between 85 to 100";
			break;
			
		case 'B':
			result="Your marks is between 75 to 84";
			break;
			
		case 'C':			
			result="Your marks is between 65 to 45";
			break;
			
		default:
			result="You did not pass";

		}	
		
		System.out.println("Your marks is:"+ result);
		

	}

}
