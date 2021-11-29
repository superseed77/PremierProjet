package domaine;

public class Person {
	private String name;
	private int age;
	public static int nombreDinstances = 0;

	public void sayHello() {
		System.out.println(name + " dit bonjour");
	}

	public void setName(String nom){
		name = nom;
	}
	
	public void setAge(int newAge){
		age = newAge;
	}
	
	public int getAge(){
		return age;
	}
	
	
}
