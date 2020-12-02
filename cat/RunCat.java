package cat;

public class RunCat {

	public static void main(String[] args) {
		
		Cat myCat = new Cat("java","gris",11);
		myCat.show();
		
		Cat yourCat = new Cat("francis","blanc",1);
		yourCat.show();
		
		Cat otherCat = new Cat("roux");
		otherCat.show();
		otherCat.setName("patapouf");
		otherCat.show();
		
		System.out.println("chat1: "+myCat.getName());
		System.out.println("chat2: "+yourCat.getName());
		System.out.println("chat3: "+otherCat.getName());
		
		myCat.listen();
		
	}
}
