package Test;

public class Dog {
	String name;
	String says;
	
	public static void main(String[] args) {
		Dog dog1 = new Dog();
		Dog dog2 = new Dog();
		dog1.name = "spot";
		dog1.says = "Ruff";
		dog2.name = "scruffy";
		dog2.says = "Wurf";
		
		System.out.println(dog1.name + "--" + dog1.says);
		System.out.println(dog2.name + "--" + dog2.says);
		
		Dog dog3 = dog1;
		Dog dog4 = new Dog();
		dog4 = dog1;
		System.out.println(dog3 == dog1); // true
		System.out.println(dog3.equals(dog1)); // true
		
		System.out.println(dog1 == dog4); // true
		System.out.println(dog1.equals(dog4)); // true
	}
}
