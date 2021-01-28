package abstractex;
abstract class Car{
	public abstract void drive();
	public abstract void stop();
	
	public void startCar() {
		System.out.println("시동을 켭니다.");
	}
	public void turnOff() {
		System.out.println("시동을 끕니다.");
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
		System.out.println("자율 주행 합니다.");
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("스스로 멈춥니다.");
	}
	@Override
	public void washCar() {
		System.out.println("자동 세차 합니다.");
	}
	
}
class ManualCar extends Car{

	@Override
	public void drive() {
		// TODO Auto-generated method stub
		System.out.println("사람이 운전합니다.");
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("멈춥니다.");
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
