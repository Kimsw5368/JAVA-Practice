package Fast;
import java.util.*;
class Book2{
	String bookname;
	public Book2(String bookname){
		this.bookname = bookname;
	}
	public String getBookname() {
		return bookname;
	}
	public void setBookname(String bookname) {
		this.bookname = bookname;
	}
}
class Student4{
	int StudentId;
	String StudentName;
	ArrayList<Book2> a = new ArrayList<Book2>();
	
	public Student4(int StudentId, String StudentName) {
		this.StudentId = StudentId;
		this.StudentName = StudentName;
	}
	public void addBook(String bookname) {
		Book2 b = new Book2(bookname);
		a.add(b);
	}
	public void showStudentInfo() {
		System.out.print(StudentName + "�л��� ���� å�� : ");
		
		for (Book2 b : a) {
			System.out.print(b.getBookname() + " ");
		}
		System.out.println("�Դϴ�.");
	}
}
public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student4 studentLee = new Student4(1001,"Lee");
		
		studentLee.addBook("�¹���1");
		studentLee.addBook("�¹���2");
		studentLee.addBook("�¹���3");
		
		Student4 studentKim = new Student4(1002,"Kim");
		
		studentKim.addBook("����1");
		studentKim.addBook("����2");
		studentKim.addBook("����3");
		
		Student4 studentCho = new Student4(1003,"Cho");
		
		studentCho.addBook("�ظ�����1");
		studentCho.addBook("�ظ�����2");
		studentCho.addBook("�ظ�����3");
		
		studentLee.showStudentInfo();
		studentKim.showStudentInfo();
		studentCho.showStudentInfo();
	}

}
