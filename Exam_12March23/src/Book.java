
public class Book {
	int bookNo;
	String bookName;
	String author;
	float bookPrice;

	public Book(int bookNo, String bookName, String author, float price) {
		this.bookNo = bookNo;
		this.bookName = bookName;
		this.author = author;
		this.bookPrice = price;
	}
	
	public float getBookPrice() {
		return bookPrice;
	}
	

	@Override
	public String toString() {
		return "Book [bookNo=" + bookNo + ", bookName=" + bookName + "]";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book book1 = new Book(1,"C++","Yeshwant Kanetkar",300.07f);
		Book book2 = new Book(2,"Java","Herbalt shield",400.07f);
		if(book1.getBookPrice()>book2.getBookPrice()) {
			System.out.println(" C++ has more price than java book "+book1);
		}else {
			System.out.println(" Java has more price than C++ book"+book2);
		}

	}

}
