package object;

class Book{
	String title;
	String author;
	
	public Book(String title, String author) {
		this.author = author;
		this.title = title;
	}

	//@Override
	public String toString() {
		// TODO Auto-generated method stub
		return author + "," + title;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	
}

public class toStringTest extends Object{

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		Book book = new Book("����","�ڰ渮");
		
		System.out.println(book);
		String str = new String("����");
		System.out.println(str.toString());
		
		Book book2 = (Book)book.clone();
	}

}
