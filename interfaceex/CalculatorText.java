package interfaceex;

import Fast.Com;

abstract class Calculator implements Calc{

	@Override
	public int add(int num1, int num2) {
		// TODO Auto-generated method stub
		return num1 + num2;
	}

	@Override
	public int substract(int num1, int num2) {
		// TODO Auto-generated method stub
		return num1 - num2;
	}
	
}

class CompleteCalc extends Calculator{

	@Override
	public int times(int num1, int num2) {
		// TODO Auto-generated method stub
		return num1 * num2 ;
	}

	@Override
	public int divide(int num1, int num2) {
		// TODO Auto-generated method stub
		if(num2 == 0)
			return ERROR;
		else
			return num1 / num2;
	}
	public void showInfo() {
		System.out.println("구현완료");
	}
	@Override
	public void description() {
		System.out.println("재정의");
	}
}
public class CalculatorText {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CompleteCalc calc = new CompleteCalc();
		int n1 = 10;
		int n2 = 2;
		
		System.out.println(calc.add(n1, n2));
		System.out.println(calc.substract(n1, n2));
		System.out.println(calc.times(n1, n2));
		System.out.println(calc.divide(n1, n2));
		calc.description();
		/*int[] arr = {1,2,3,4,5};
		CompleteCalc.total(arr);
		System.out.println(sum);*/
	}

}
