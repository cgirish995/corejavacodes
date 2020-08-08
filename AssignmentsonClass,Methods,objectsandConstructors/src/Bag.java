
public class Bag {
	
	
	//Instance or fields
	String brandName;
	int price;
	String color;
	
	Bag(){
		System.out.println("No Argument Constructor");
	}
	
	
	public Bag(String inbrandName,String incolor){
		brandName=inbrandName;
		color=incolor;

	}
	
	public Bag(String inbrandName,String incolor,int inprice){
		brandName=inbrandName;
		color=incolor;
		price=inprice;
	}
	
	void numberofZip() {
		System.out.println("BAgs contains number of Zips");
	}
	
	void openingBag() {
		System.out.println("Opening the bags");
	}
	
	void takingthebooks() {
		System.out.println("Taking the books from bag");
	}
	
	



	public static void main(String[] args) {
		
		
	Bag big = new Bag();
	System.out.println("Company name :" +big.brandName+" Bag price : " + big.price + "Bag color : " + big.color);	
		
	big.brandName="Schoolbag";
	big.price=500;
	big.color="grey";
	System.out.println("Company name :" +big.brandName +" Bag price : " + big.price + "Bag color : " + big.color);	

	Bag small = new Bag ("smallBag" ,"black" ,100);
	System.out.println("Company name :" +small.brandName+" Bag price : " + small.price + "Bag color : " + small.color);
	
	Bag medium = new Bag("mediumBag","White",800);
	System.out.println("Company name :" +medium.brandName+" Bag price : " + medium.price + "Bag color : " + medium.color);
	
	}

}
