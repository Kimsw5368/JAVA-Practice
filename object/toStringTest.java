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
		Book book = new Book("토지","박경리");
		
		System.out.println(book);
		String str = new String("토지");
		System.out.println(str.toString());
		
		Book book2 = (Book)book.clone();
	}

}
