package bookpackext;

class ProtectDemo {
	public static void main(String args[]) {
		ExtBook books[] = new ExtBook[5];
		books[0] = new ExtBook("The Saint Meets the Tiger", "L. Charteris", 2014, "Random Pubs");
		books[1] = new ExtBook("Java: The Complete Fiasco", "Schmuck", 2014, "McGrow-Nads Amateur");
		books[2] = new ExtBook("The Art of Nap", "Schmuck", 2003, "McGrow-Nads Amateur");
		books[3] = new ExtBook("Red Storm Rising", "Clancy", 1986, "Putnam");
		books[4] = new ExtBook("On the Road", "Kerouac", 1955, "Viking");
		System.out.println("****** Printing a list of all the books ******");
		for(int i=0; i < books.length; i++) {
			books[i].show();
		}
		System.out.println("****** End of List ******\n\n");
		// Find books by author
		System.out.println("****** Showing a list of all books by Schmuck ******");
		System.out.println("Showing all books by Schmuck.");
		for(int i=0; i < books.length; i++) {
				if(books[i].getAuthor() == "Schmuck") {
					System.out.println(books[i].getTitle());			
				}
				// books[0].title = "test title"; // Error – not accessible as it is protected
		}
		System.out.println("****** End of List ******");
	}
}
