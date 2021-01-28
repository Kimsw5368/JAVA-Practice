package witharrylist;

public class VIPCustomer extends Customer{
	double salesRatio;
	private int agentID;

	public VIPCustomer(int customerID, String customerName) {
		super(customerID, customerName);
		customerGrade = "VIP";
		bonusRatio = 0.05;
		salesRatio = 0.1;
		agentID = 101010;
	}
	@Override
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price - (int)(price * salesRatio);
	}
	public void showCustomerInfo() {
		System.out.println("담당 상담원 번호는 " + agentID + "입니다.");
	}
}
