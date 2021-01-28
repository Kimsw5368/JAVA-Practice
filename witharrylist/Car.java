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
		System.out.println("Sonata �õ��� �մϴ�.");
	}

	@Override
	public void drive() {
		// TODO Auto-generated method stub
		System.out.println("Sonata �޸��ϴ�.");
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("Sonata ����ϴ�.");
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("Sonata �õ��� ���ϴ�.");
	}
	
}
class Grandeur extends Car{

	@Override
	public void start() {
		// TODO Auto-generated method stub
		System.out.println("Grandeur �õ��� �մϴ�.");
	}

	@Override
	public void drive() {
		// TODO Auto-generated method stub
		System.out.println("Grandeur �޸��ϴ�.");
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("Grandeur ����ϴ�.");	
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("Grandeur �õ��� ���ϴ�.");
	}
}
class Avante extends Car{

	@Override
	public void start() {
		// TODO Auto-generated method stub
		System.out.println("Avante �õ��� �մϴ�.");
	}

	@Override
	public void drive() {
		// TODO Auto-generated method stub
		System.out.println("Avante �޸��ϴ�.");	
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("Avante ����ϴ�.");
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("Avante �õ��� ���ϴ�.");
	}
}
class Genesis extends Car{

	@Override
	public void start() {
		// TODO Auto-generated method stub
		System.out.println("Genesis �õ��� �մϴ�.");
	}

	@Override
	public void drive() {
		// TODO Auto-generated method stub
		System.out.println("Genesis �޸��ϴ�.");
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("Genesis ����ϴ�.");
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("Genesis �õ��� ���ϴ�.");
	}
	
}
