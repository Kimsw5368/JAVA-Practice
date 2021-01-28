package Fast;
import java.util.Scanner;

class Customer{
	private int customerID;
	protected String customerName;
	protected String customerGrade;
	int bonusPoint;
	double bonusRatio;
	
	public int getCustomerID() {
		return customerID;
	}

	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerGrade() {
		return customerGrade;
	}

	public void setCustomerGrade(String customerGrade) {
		this.customerGrade = customerGrade;
	}	
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price;
	}
	
	public String showCustomerInfo() {
		return customerName + "님의 등급은" + customerGrade + "이며, 적립된 보너스 포인트는" + bonusPoint + "점 입니다.";
	}
	public Customer() {
		customerGrade = "SILVER";
		bonusRatio = 0.01;
	}
}
class VIPCustomer extends Customer{
	double salesRatio;
	private int agentID;
	
	public VIPCustomer() {
		customerGrade = "VIP";
		bonusRatio = 0.05;
		salesRatio = 0.01;
	}
	@Override 
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price - (int)(price * salesRatio); 
	}
}
public class Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		Customer customerLee = new Customer();
		System.out.print("이름 입력 : ");
		customerLee.setCustomerName(scanner.nextLine());
		System.out.print("아이디 입력:");
		customerLee.setCustomerID(scanner.nextInt());
		customerLee.bonusPoint = 100;
		System.out.println(customerLee.showCustomerInfo());
		
		//VIPCustomer coustomerKim = new VIPCustomer();
		//coustomerKim.setCustomerName("김유신");
		//coustomerKim.setCustomerID(10020);
		//coustomerKim.bonusPoint = 10000;
		//System.out.println(coustomerKim.showCustomerInfo());
	}

}
