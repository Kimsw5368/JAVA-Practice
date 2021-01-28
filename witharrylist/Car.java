package witharrylist;

public abstract class Car {
	public abstract void start();
	public abstract void drive();
	public abstract void stop();
	public abstract void turnOff();
	
	public final void run() {
		start();
		drive();
		stop();
		turnOff();
	}
}
class Sonata extends Car{

	@Override
	public void start() {
		// TODO Auto-generated method stub
		System.out.println("Sonata 시동을 켭니다.");
	}

	@Override
	public void drive() {
		// TODO Auto-generated method stub
		System.out.println("Sonata 달립니다.");
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("Sonata 멈춥니다.");
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("Sonata 시동을 끕니다.");
	}
	
}
class Grandeur extends Car{

	@Override
	public void start() {
		// TODO Auto-generated method stub
		System.out.println("Grandeur 시동을 켭니다.");
	}

	@Override
	public void drive() {
		// TODO Auto-generated method stub
		System.out.println("Grandeur 달립니다.");
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("Grandeur 멈춥니다.");	
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("Grandeur 시동을 끕니다.");
	}
}
class Avante extends Car{

	@Override
	public void start() {
		// TODO Auto-generated method stub
		System.out.println("Avante 시동을 켭니다.");
	}

	@Override
	public void drive() {
		// TODO Auto-generated method stub
		System.out.println("Avante 달립니다.");	
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("Avante 멈춥니다.");
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("Avante 시동을 끕니다.");
	}
}
class Genesis extends Car{

	@Override
	public void start() {
		// TODO Auto-generated method stub
		System.out.println("Genesis 시동을 켭니다.");
	}

	@Override
	public void drive() {
		// TODO Auto-generated method stub
		System.out.println("Genesis 달립니다.");
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("Genesis 멈춥니다.");
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("Genesis 시동을 끕니다.");
	}
	
}
