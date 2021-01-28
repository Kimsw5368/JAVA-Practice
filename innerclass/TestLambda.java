package innerclass;

interface PrintString{
	void showString(String str);
}
public class TestLambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrintString lambda = s->System.out.println(s);
		lambda.showString("Test");
		
		ShowMyString(lambda);
		
		PrintString test = returnStirng();
		test.showString("Test3");
	}
	
	public static void ShowMyString(PrintString p) {
		p.showString("Test2");
	}
	public static PrintString returnStirng() {
		return s->System.out.println(s + "!!!");
	}
}
