package object;

class MyDate{
	int day;
	int month;
	int year;
	
	public MyDate(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if (obj instanceof MyDate) {
			MyDate date = (MyDate)obj;
			if (this.day == date.day)
				return true;
			if (this.month == date.month)
				return true;
			if(this.year == date.year)
				return true;
			else return false;			
		}
		return false;
	}
	
}

public class MydateTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyDate date1 = new MyDate(10,3,2020);
		MyDate date2 = new MyDate(10,3,2020);
		
		System.out.println(date1.equals(date2));
		System.out.println(date1.hashCode());
		System.out.println(date2.hashCode());
	}

}
