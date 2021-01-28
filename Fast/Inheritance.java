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
		return customerName + "���� �����" + customerGrade + "�̸�, ������ ���ʽ� ����Ʈ��" + bonusPoint + "�� �Դϴ�.";
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
		System.out.print("�̸� �Է� : ");
		customerLee.setCustomerName(scanner.nextLine());
		System.out.print("���̵� �Է�:");
		customerLee.setCustomerID(scanner.nextInt());
		customerLee.bonusPoint = 100;
		System.out.println(customerLee.showCustomerInfo());
		
		//VIPCustomer coustomerKim = new VIPCustomer();
		//coustomerKim.setCustomerName("������");
		//coustomerKim.setCustomerID(10020);
		//coustomerKim.bonusPoint = 10000;
		//System.out.println(coustomerKim.showCustomerInfo());
	}

}
