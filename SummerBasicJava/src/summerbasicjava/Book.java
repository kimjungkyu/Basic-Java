package summerbasicjava;

public class Book {

	String title;
	String author;
	int ISBN;
	
	public Book(String title, String author, int ISBN){
		this.title = title;
		this.author = author;
		this.ISBN = ISBN;
	}
	
	public static void main(String[] args){
		Book javabook = new Book("JavaBook","김정규", 3333);
		
		System.out.println("책페이지" +" "+ javabook.title);
		System.out.println("작가" +" "+ javabook.author);
		System.out.println("책 번호" +" "+ javabook.ISBN);
	}
}
