package domaine;

public class MainTest {

	public static void main(String[] args) {
		Person p = new Person();
		p.setName("Bob");
		p.sayHello();

		Object o = new Person();
		Person p2 = (Person) o;

		p2.setName("Bill");

		p2.sayHello();
		
		p2.setAge(21);
		
		System.out.println(p2.getAge());
		int age = p2.getAge();
		
		System.out.println(Person.nombreDinstances);
		Person.nombreDinstances = 12;
		
		System.out.println(p2.nombreDinstances);
		System.out.println(p.nombreDinstances);
		
	}

}
