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
		System.out.println("나이" + age);
		System.out.println("이름" + name);
		System.out.println("독신여부" + marry);
		System.out.println("자식" + Children);
	}
}
public class Person {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("정보입력");
		Per p = new Per(scanner.nextInt(),scanner.next(),scanner.nextBoolean(),scanner.nextInt());
		p.SetPer();
		scanner.close();
	}

}
