package Fast;
import java.util.Scanner;

class Date1{
	private int year;
	private int month;
	private int day;
	private boolean isValid = true;
	public Date1(int year, int month, int day) {
		this.year = year;
		this.month = month;
		this.day = day;
	}
	public void isValid() {
		switch(month){
		case 1: case 3: case 5: case 7: case 9: case 10: case 12:
			if(day < 0 || day > 31) {
				isValid = false;
			}
			break;
		case 4: case 6: case 8: case 11:
			if(day < 0 || day > 30) {
				isValid = false;
			}
			break;
		case 2:
			if(day < 0 || day > 28) {
				isValid = false;
			}
			else if((year % 4 != 0 && year % 100 ==  0) || year % 400 != 0 ) {
				isValid = false;
			}
		}
		if (month < 1 || month > 12) {
			isValid = false;
		}
		if(isValid ) {
			System.out.println(year + "년" + month + "월" + day + "일 입니다.");
			}
			else {
				System.out.println("유효하지 않습니다.");
			}
	}
}
public class MyDate2 { 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("년 월 달 입력 >> ");
		Date1 d = new Date1(scanner.nextInt(),scanner.nextInt(),scanner.nextInt());
		d.isValid();
	}

}
