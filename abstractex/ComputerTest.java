package abstractex;
abstract class Computer{
	public abstract void display();
	public abstract void typing();
	
	public void turnon() {
		System.out.println("������ �մϴ�.");
	}
	public void turnoff() {
		System.out.println("������ ���ϴ�");
	}
}

class DeskTop extends Computer{
	public void display() {
		System.out.println("DeskTop Display");
	}
	public void typing() {
		System.out.println("DeskTop Typing");
	}
	@Override
	public void turnoff() {
		System.out.println("DeskTop off");  
	}
}

abstract class NoteBook extends Computer{
	@Override
	public void typing() {
		System.out.println("NoteBook typing");
	}
}
class MyNoteBook extends NoteBook{
	@Override
	public void display() {
		System.out.println("MyNoteBook Display");
	}
}
public class ComputerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Computer computer = new DeskTop();
		computer.display();
		computer.turnoff();
		
		Computer myNote = new MyNoteBook();
	}	

}
