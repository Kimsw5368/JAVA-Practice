package Fast;

public class CharArrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] alp = new char[26];
		char ch = 'A';
		
		for(int i=0; i<alp.length;i++) {
			alp[i] = ch++;
			System.out.print(alp[i]);
		}
		/*for(int i=0; i<alp.length;i++) {
			System.out.print(alp[i]);
		}*/
	}

}
