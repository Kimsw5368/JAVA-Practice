package Fast;
import java.util.*;
class Subject{
	private String name;
	private int score;
	
	public Subject(String name, int score) {
		this.name = name;
		this.score = score;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
}
class Student3{
	int studentID;
	String studentName;
	ArrayList<Subject> subjectList = new ArrayList<Subject>();
	
	public Student3(int studentID, String studentName) {
		this.studentID = studentID;
		this.studentName = studentName;
		
	}
	public void addSubject(String name, int score) {
		Subject subject = new Subject(name,score);
		
		subjectList.add(subject);
	}
	public void showStudentInfo() {
		int total = 0;
		
		for(Subject subject : subjectList) {
			total += subject.getScore();
			System.out.println(studentName + "�л���" + subject.getName() + "������ ������" + subject.getScore());
		}
		System.out.println(studentName + "�л��� ������" + total + "�� �Դϴ�.");
	}
}
public class StudentArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student3 studentLee = new Student3(1001,"Lee");
		
		studentLee.addSubject("����",100);
		studentLee.addSubject("����",90);
		
		Student3 studentKim = new Student3(1002,"kim");
		studentKim.addSubject("����",100);
		studentKim.addSubject("����",90);
		studentKim.addSubject("����",80);
		
		studentKim.showStudentInfo();
		System.out.println("==========================");
		studentLee.showStudentInfo();
	}

}
