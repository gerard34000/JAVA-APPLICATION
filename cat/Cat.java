package cat;

public class Cat {
	private String name= "chat"; 
	private String color = "gris";
	public static int age = 11;
	
	//constructeur----------------------------------------------------
	
	public Cat(String name,String color,int age) {
		this.name = name;
		this.color=color;
		this.age = age ;
	}
	
	public Cat(String color) {
		this.color=color;
			
	}
	
		//----------------------------setters-------------------------------
	public void setName(String name) {
		this.name = name;
	}
	
	public void setColor(String color) {
		this.color = color;
		this.name = "chat"; //valeur par defaut
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	//------------------------------getters-----------------------------------------
	public String getName () {
		return this.name;
	}
	
	public String getColor () {
		return this.color;
	}
	
	public int getAge () {
		return this.age;
	}
	
	//----------------------------show--------------------------------------
	
	public void show() {
		System.out.println("chat nommé "+this.name+" de couleur "+this.color+" et d age "+this.age);
	}
	
	//----------------------------action-------------------------------------
	public void listen() {
		System.out.println("RRRRRRRRrrrrr");
	}
	
}
