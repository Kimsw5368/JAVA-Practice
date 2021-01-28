package abstractex;
abstract class Car{
	public abstract void drive();
	public abstract void stop();
	
	public void startCar() {
		System.out.println("�õ��� �մϴ�.");
	}
	public void turnOff() {
		System.out.println("�õ��� ���ϴ�.");
	}
	public void washCar() {}
	final public void run() {
		startCar();
		drive();
		stop();
		turnOff();
		washCar();
	}
}
class AICar extends Car{

	@Override
	public void drive() {
		// TODO Auto-generated method stub
		System.out.println("���� ���� �մϴ�.");
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("������ ����ϴ�.");
	}
	@Override
	public void washCar() {
		System.out.println("�ڵ� ���� �մϴ�.");
	}
	
}
class ManualCar extends Car{

	@Override
	public void drive() {
		// TODO Auto-generated method stub
		System.out.println("����� �����մϴ�.");
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("����ϴ�.");
	}
	
}
public class CarTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car aicar = new AICar();
		aicar.run();
		System.out.println("========");
		Car manualcar = new ManualCar();
		manualcar.run();
	}

}
