package set;
class Customer{
	private String name;
	private int age;
	private int price;
	
	public Customer(String name, int age, int price) {
		this.name = name;
		this.age = age;
		this.price = price;
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

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	public String toString() {
		return name + "," + age + "," + price;
	}
	
}
public class TravelTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer lee = new Customer("ÀÌ¼ø½Å", 40, 100);
		Customer kim = new Customer("±èÀ¯½Å", 20, 100);
		Customer hong = new Customer("È«±æµ¿", 13, 50);
		
		System.out.println(lee.toString());
		System.out.println(kim.toString());
		System.out.println(hong.toString());
	}

}
