package Fast;
class Student{
	String studentName;
	int money;
	public Student(String studentName, int money) {
		this.studentName = studentName;
		this.money = money;
	}
	public void takeBus(Bus bus) {
		bus.take(1000);
		this.money -= 1000;
	}
	public void takeSubway(Subway sub) {
		sub.take(1200);
		this.money -= 1200;
	}
	public void takeTaxi(Taxi taxi) {
		taxi.take(10000);
		this.money -= 10000;
	}
	public void showInfo() {
	System.out.println(studentName + "���� ���� ���� " + money);
	}
}
class Bus{
	int busNumber;
	int passengerCount;
	int money;
	public Bus(int busNumber) {
		this.busNumber = busNumber;
	}
	public void take(int money) {
		this.money += money;
		passengerCount++;
	}
	public void showBusInfo() {
		System.out.println(busNumber + "�� ������ �°��� " + passengerCount + "�� �̰� ������ " + money + "�Դϴ�.");
	}
}
class Subway{
	int lineNumber;
	int passengerCount;
	int money;
	public Subway(int lineNumber){
		this.lineNumber = lineNumber;
	}
	public void take(int money) {
		this.money += money;
		passengerCount++;
	}
	public void showSubwayInfo() {
		System.out.println(lineNumber + "�� ����ö�� �°��� " + passengerCount + "�� �̰� ������ " + money + "�Դϴ�.");
	}
}
class Taxi{
	int taxiNumber;
	int passengerCount;
	int money;
	public Taxi(int taxiNumber) {
		this.taxiNumber = taxiNumber;
	}
	public void take(int money) {
		this.money += money;
		passengerCount++;
	}
		public void showTaxiInfo() {
			System.out.println(taxiNumber + "�� �ý��� �°��� " + passengerCount + "�� �̰� ������ " + money + "�Դϴ�.");
	}
}
public class SubBus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student j = new Student("ja",5000);
		Student t = new Student("to",10000);
		Student e = new Student("ed",20000);
		
		Bus bus100 = new Bus(100);
		Subway sub = new Subway(2);
		Taxi taxi = new Taxi(1234);
		
		j.takeBus(bus100);
		t.takeSubway(sub);
		e.takeTaxi(taxi);
		
		j.showInfo();
		t.showInfo();
		e.showInfo();
		
		bus100.showBusInfo();
		sub.showSubwayInfo();
		taxi.showTaxiInfo();
		
	}

}
