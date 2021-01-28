package Fast;
import java.util.Scanner;
class Hiding{
	int day;
	int month;
	int year;
	boolean isValid;
	public void showDate() {
		if(isValid ) {
		System.out.println(year + "년" + month + "월" + day + "일 입니다.");
		}
		else {
			System.out.println("유효하지 않습니다.");
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
		System.out.print("년도 달 일 을 입력하세요 >> ");
		Hiding h = new Hiding();
		h.year= scanner.nextInt();
		h.month = scanner.nextInt()	;
		h.day = scanner.nextInt();
		h.showDate();
	}

}
