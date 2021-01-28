package interfaceex;

import java.io.IOException;

class RoundRobin implements Scheduler{

	@Override
	public void getNextCall() {
		System.out.println("��� ��ȭ�� ������� �����ɴϴ�.");
	}

	@Override
	public void sendCallToAgent() {
		System.out.println("���� ������ �������� ����մϴ�.");		
	}
}

class LeastJob implements Scheduler{

	@Override
	public void getNextCall() {
		System.out.println("��� ��ȭ�� ������� �����ɴϴ�.");
	}

	@Override
	public void sendCallToAgent() {
		System.out.println("���� �������� ���ų� ����Ⱑ ���� ���� �������� �Ҵ��մϴ�.");
	}
	
}

class PriorityAllocation implements Scheduler{

	@Override
	public void getNextCall() {
		System.out.println("������� ���� ���� call�� ���� �����ɴϴ�.");
	}

	@Override
	public void sendCallToAgent() {
		System.out.println("���� ���õ��� ���� �������� ���� ����մϴ�.");
	}
	
}

public class Call {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("��ȭ ���� �Ҵ� ����� �����ϼ���.");
		System.out.println("R : �Ѹ� ���ʴ��");
		System.out.println("L : ��Ⱑ ���� ���� �켱");
		System.out.println("P : �켱������ ���� ���켱 ���õ� ���� ����.");
		
		int ch = System.in.read();
		Scheduler scheduler = null;
		
		if ( ch == 'R' || ch == 'r') {
			scheduler = new RoundRobin();
		}
		else if (ch == 'L' || ch == 'l') {
			scheduler = new LeastJob();
		}
		else if (ch == 'P' || ch == 'p') {
			scheduler = new PriorityAllocation();
		}
		else {
			System.out.println("�������� �ʴ� ����Դϴ�.");
		}
		
		scheduler.getNextCall();
		scheduler.sendCallToAgent();
	}

}
