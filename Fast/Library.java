package Fast;
class Book{
	private String title;
	private String author;
	public Book(){
		
	}
	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	}
	public void showBookInfo() {
		System.out.println(title + "," + author);
	}
}
public class Library {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book[] li = new Book[5];
		
		li[0] = new Book("�¹���","������");
		li[1] = new Book("�¹���2","������");
		li[2] = new Book("�¹���3","������");
		li[3] = new Book("�¹���4","������");
		li[4] = new Book("�¹���5","������");
		
		for(int i =0; i<li.length; i++) {
			System.out.println(li[i]);
			li[i].showBookInfo();
		}
	}

}
