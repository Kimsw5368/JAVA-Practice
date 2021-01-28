package object;

import java.lang.reflect.Constructor;


class Person{
	private String name;
	private int age;
	
	public Person() {};
	public Person(String name) {
		this.name = name;
	}
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String toString() {
		return name;
	}
}
public class PersonText {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, SecurityException {
		// TODO Auto-generated method stub
		Person person = new Person("James");
		System.out.println(person);
		Class c1 = Class.forName("object");
		Person person1 = (Person) c1.newInstance();
		System.out.println(person1);
		
		Class[] parameterTypes = {String.class};
		Constructor cons = c1.getConstructor(parameterTypes);
		
		Object[] initargs= {"±Ë¿ØΩ≈"};
		System.out.println("personLee");
	}

}
