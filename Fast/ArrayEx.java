package Fast;

public class ArrayEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[10];
		int total = 0;
		for (int i=0,num=1; i<arr.length; i++,num++) {
			arr[i] = num;
		}
		for (int i=0; i<arr.length; i++) {
			total += arr[i];
		}
		System.out.println(total);
		
		double[] dArry = new double[5];
		
		int count = 0;
		dArry[0] = 1.1;
		count++;
		dArry[1] = 2.1;
		count++;
		dArry[2] = 3.1;
		count++;
		double mtotal = 1;
		for(int i = 0;i<count;i++) {
			mtotal *= dArry[i];
		}
		System.out.println(mtotal);
	}

}
