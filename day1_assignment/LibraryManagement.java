package week2.day1_assignment;

public class LibraryManagement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Creating object for Library class
		Library libraryBookMgmt = new Library();
		String books = libraryBookMgmt.addBook("Learn Selenium");
		libraryBookMgmt.issueBook(books);
	}

}
