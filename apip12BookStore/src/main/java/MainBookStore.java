import bookStore.BookStore;
public class MainBookStore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BookStore bookStore = new BookStore();
		bookStore.addBook("george orwell", "1984", 8.20);
		bookStore.addBook("Philip K. Dick", "Do Androids Dream of Electric Sheep?", 3.50);
		bookStore.addBook("Isaac Asimov", "Foundation and Empire", 9.40);
		bookStore.addBook("Ray Bradbury", "Fahrenheit 451", 7.40);
		bookStore.addBook("Aldous Huxley", "A Brave New World", 6.50);
		bookStore.addBook("Isaac Asimov", "Foundation", 7.30);
		bookStore.addBook("William Gibson", "Neuromancer", 8.30);
		bookStore.addBook("Isaac Asimov", "Second Foundation", 8.10);
		bookStore.addBook("Isaac Newton", "arithmetica universalis", 7.50);
		bookStore.addBook("George Orwell", "1984", 6.20);
		bookStore.addBook("Isaac Newton", "Arithmetica Universalis", 10.50);
		
		System.out.println(bookStore);
		
		bookStore.deleteBook("George Orwell", "1984");
		bookStore.deleteBook("Aldous Huxley", "A Brave New World");
		bookStore.deleteBook("Isaac Newton", "Arithmetica Universalis");
		
		System.out.println(bookStore);
		
		System.out.println(bookStore.getFinalPrice("Philip K. Dick", "Do Androids Dream of Electric Sheep?"));
		System.out.println(bookStore.getFinalPrice("isaac asimov", "foundation and empire"));
		System.out.println(bookStore.getFinalPrice("Ray Bradbury", "Fahrenheit 451"));
		System.out.println(bookStore.getFinalPrice("Isaac Asimov", "Foundation"));
		System.out.println(bookStore.getFinalPrice("william gibson", "neuromancer"));
		System.out.println(bookStore.getFinalPrice("Isaac Asimov", "Second Foundation"));
		System.out.println(bookStore.getFinalPrice("Isaac Newton", "Arithmetica Universalis"));
	}

}
