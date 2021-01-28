package Fast;

public class ObjectCopy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book[]li = new Book[5];
		Book[]copy = new Book[5]; 
		li[0] = new Book("태백산맥","조정래");
		li[1] = new Book("태백산맥2","조정래");
		li[2] = new Book("태백산맥3","조정래");
		li[3] = new Book("태백산맥4","조정래");
		li[4] = new Book("태백산맥5","조정래");
		
		System.arraycopy(li, 0, copy, 0, 5);
		for(Book book : copy) {
			book.showBookInfo();
		}
	}

}
