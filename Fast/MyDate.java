package Fast;
import java.util.Scanner;
class Hiding{
	int day;
	int month;
	int year;
	boolean isValid;
	public void showDate() {
		if(isValid ) {
		System.out.println(year + "��" + month + "��" + day + "�� �Դϴ�.");
		}
		else {
			System.out.println("��ȿ���� �ʽ��ϴ�.");
		}
	}
	public void setDay(int day) {
		this.day = day;
	}
	public int getDay() {
		return day;
	}
	public void setMonth(int month) {
		this.month = month;
		if (month < 1 || month > 12) {
			isValid = false;
		}
	}
	public int getMonth() {
		return month;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getYear() {
		return year;
	}
}

public class MyDate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("�⵵ �� �� �� �Է��ϼ��� >> ");
		Hiding h = new Hiding();
		h.year= scanner.nextInt();
		h.month = scanner.nextInt()	;
		h.day = scanner.nextInt();
		h.showDate();
	}

}
