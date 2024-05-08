package Assignments;

public class Encapsulation {
	private String name;
	   private int age;
	   
	   public String getName() {
	       return name;
	     }    
	   public int getAge() {
	       return age;
	     }    
	   public void setName(String name) {  
	       this.name = name;
	     }
	   public void setAge(int age) {
	       this.age = age;
	     } 
	
	public static void main(String[] args) {
		Encapsulation obj = new Encapsulation();
		obj.setName("Manoj");
		String Name=obj.getName();
		obj.setAge(31);
		int Age =obj.getAge();
		System.out.println(Name);
		System.out.println(Age);

	}

}
