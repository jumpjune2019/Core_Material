package bookpack;

public class BookDemo {
	public static void main(String args[]) {
		Book books[] = new Book[5];
		books[0] = new Book("The Saint meets the Tiger", "L. Charteris", 1928);
		books[1] = new Book("Java: The Complete Reference", "Schildt", 2014);
		books[2] = new Book("The Art of War", "Sun Tzu", 1920);
		books[3] = new Book("Red Storm Rising", "Clancy", 1986);
		books[4] = new Book("On the Road", "Kerouac", 1955);
		for(int i=0; i < books.length; i++) {
			books[i].show();
		}
	}
}
