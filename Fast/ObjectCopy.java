package Fast;

public class ObjectCopy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book[]li = new Book[5];
		Book[]copy = new Book[5]; 
		li[0] = new Book("�¹���","������");
		li[1] = new Book("�¹���2","������");
		li[2] = new Book("�¹���3","������");
		li[3] = new Book("�¹���4","������");
		li[4] = new Book("�¹���5","������");
		
		System.arraycopy(li, 0, copy, 0, 5);
		for(Book book : copy) {
			book.showBookInfo();
		}
	}

}
