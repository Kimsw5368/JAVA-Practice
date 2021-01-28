package Fast;
import java.util.*;
public class ArrayListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("aaa");
		list.add("bbb");
		list.add("ccc");
		
		for(int i=0; i<list.size();i++) {
			String string = list.get(i);
			System.out.println(string);
		}
		for(String s : list) {
			System.out.println(s);
		}
	}

}
