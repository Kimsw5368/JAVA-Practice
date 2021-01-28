package interfaceex;

public interface Sort {
	void ascending(int[] arr);
	void descending(int[] arr);
	
	default void description() {
		System.out.println("정렬 알고리즘");
	}
}
