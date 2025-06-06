package week2.day1_assignment;

public class Library {
	
	// Method to add Book in the Library
	public String addBook(String  bookTitle)
	{
		System.out.println(bookTitle + " Book added Successfully");
		return bookTitle;
	}
	
	//Method to issue Book from the Library
	public void issueBook(String bookTitle)
	{
		System.out.println(bookTitle + " Book issued successfully");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Creating object for Library class
		Library libraryBookMgmt = new Library();
		String books = libraryBookMgmt.addBook("Learn Selenium");
		libraryBookMgmt.issueBook(books);
	}

}
