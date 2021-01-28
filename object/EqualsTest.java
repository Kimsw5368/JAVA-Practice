package object;

class Student{
	int studentNum;
	String studentName;
	public Student(int studentNum, String studentName) {
		this.studentName = studentName;
		this.studentNum = studentNum;
	}
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Student) {
			Student std = (Student)obj;
			if (this.studentNum == std.studentNum)
				return true;
			else return false;
		}
		return false;
	}
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return studentNum;
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	
}

public class EqualsTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student lee = new Student(100,"이순신");
		Student lee2 = lee;
		Student sin = new Student(100,"이순신");
		
		System.out.println(lee == sin);
		System.out.println(lee.equals(sin));
		
		System.out.println(lee.hashCode());
		System.out.println(sin.hashCode());
		
		Integer i1 = new Integer(100);
		Integer i2 = new Integer(100);
		
		System.out.println(i1.equals(i2));
		System.out.println(i1.hashCode());
		System.out.println(i2.hashCode());
		
		System.out.println(System.identityHashCode(i1));
		System.out.println(System.identityHashCode(i2));
	}

}
