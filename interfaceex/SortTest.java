package interfaceex;

import java.io.IOException;

class Bubblesort implements Sort{

	@Override
	public void ascending(int[] arr) {
		// TODO Auto-generated method stub
		System.out.println("BubbleSort ascending");
	}

	@Override
	public void descending(int[] arr) {
		System.out.println("BubbleSort descending");
		
	}
	@Override
	public void description() {
		Sort.super.description();
		System.out.println("BubbleSort");
	}
	
}
class HeapSort implements Sort{

	@Override
	public void ascending(int[] arr) {
		System.out.println("HeapSortSort ascending");
	}

	@Override
	public void descending(int[] arr) {
		// TODO Auto-generated method stub
		System.out.println("HeapSort descending");
	}
	@Override
	public void description() {
		Sort.super.description();
		System.out.println("HeapSort");
	}
}
class QuickSort implements Sort{

	@Override
	public void ascending(int[] arr) {
		// TODO Auto-generated method stub
		System.out.println("QuickSort ascending");
	}

	@Override
	public void descending(int[] arr) {
		// TODO Auto-generated method stub
		System.out.println("QucikSort descending");
	}
	@Override
	public void description() {
		Sort.super.description();
		System.out.println("QucikSort");
	}
}
public class SortTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("정렬방식을 선택하세요");
		int ch = System.in.read();
		Sort sort = null;
		if(ch == 'B' || ch =='b') {
			sort = new Bubblesort();
		}
		else if(ch == 'H' || ch =='h') {
			sort = new HeapSort();
		}
		else if(ch == 'Q' || ch == 'q') {
			sort = new QuickSort();
		}
		sort.ascending(null);
		sort.descending(null);
		sort.description();
	}

}
