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
		
		li[0] = new Book("태백산맥","조정래");
		li[1] = new Book("태백산맥2","조정래");
		li[2] = new Book("태백산맥3","조정래");
		li[3] = new Book("태백산맥4","조정래");
		li[4] = new Book("태백산맥5","조정래");
		
		for(int i =0; i<li.length; i++) {
			System.out.println(li[i]);
			li[i].showBookInfo();
		}
	}

}
