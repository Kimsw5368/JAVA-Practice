package Fast;
import java.util.Scanner;
class Per{
	private int age,Children;
	private String name;
	private boolean marry;
	public Per(int age, String name, boolean marry, int Children) {
		this.age = age;
		this.name = name;
		this.marry = marry;
		this.Children = Children;
	}
	public void SetPer() {
		System.out.println("����" + age);
		System.out.println("�̸�" + name);
		System.out.println("���ſ���" + marry);
		System.out.println("�ڽ�" + Children);
	}
}
public class Person {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("�����Է�");
		Per p = new Per(scanner.nextInt(),scanner.next(),scanner.nextBoolean(),scanner.nextInt());
		p.SetPer();
		scanner.close();
	}

}
