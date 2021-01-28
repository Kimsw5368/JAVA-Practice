package Fast;
class Person1{
	private String name;
	private int money;
	public Person1(String name, int money) {
		this.money = money;
		this.name = name;
	}
	public void buyStarCoffe(StarCoffe sc, int money) {
		System.out.println("현재금액 : " + this.money);
		System.out.println(name + "님이 " + money + "으로" + " 별다방 아메리카노 구입");
		sc.take(4000);
		this.money -= 4000;
		System.out.println("현재금액 : " + this.money);
		System.out.println();
	}
	public void buyBeanCoffe(BeanCoffe bc, int money) {
		System.out.println("현재금액 : " + this.money);
		System.out.println(name + "님이 " + money + "으로" + " 콩다방 아메리카노 구입");
		bc.take(4500);
		this.money -= 4500;
		System.out.println("현재금액 : " + this.money);
	}
}
class StarCoffe{
	private int money = 0;
	public StarCoffe(int money){
		this.money = money;
	}
	public void take(int money) {
		this.money += 4000;
		System.out.println("별다방 수익 : " + money);
	}
}
class BeanCoffe{
	private int money = 0;
	public BeanCoffe(int money) {
		this.money = money;
	}
	public void take(int money) {
		this.money += 4500;
		System.out.println("콩다방 수익 : " + money);
	}
	
}
public class CoffeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person1 kim = new Person1("kim",10000);
		Person1 lee = new Person1("lee",10000);
		StarCoffe sc = new StarCoffe(4000);
		BeanCoffe bc = new BeanCoffe(4500);
		
		kim.buyStarCoffe(sc,4000);
		lee.buyBeanCoffe(bc,4500);
	}

}
