import java.util.Scanner;

class Books
{
	String name;
	String author;
	int price;
	int numPages;

	Books(String name, String author, int price, int numPages)
	{
		this.name = name; 
		this.author = author; 
		this.price = price;
		this.numPages = numPages;
	}

	public String toString()
	{
		String name, author, price, numPages;
		name = "Book name: " + this.name + "\n";
		author = "Author name: " + this.author + "\n";
		price = "Price: " + this.price + "\n";
		numPages = "Number of Pages: " + this.numPages + "\n";
		return name + author + price + numPages;
	}
}

class books_main
{
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		int n,i;
		String name;
		String author;
		int price;
		int numPages;
		
		System.out.println("Enter number of books: ");
		n = s.nextInt();

		Books b[];
		b = new Books[n];

		for(i = 0; i < n; i++)
		{
			System.out.println("Enter name of book: ");
			name = s.next();
			System.out.println("Enter author of book: ");
			author = s.next();
			System.out.println("Enter price of book: ");
			price = s.nextInt();
			System.out.println("Enter number of pages: ");
			numPages = s.nextInt();
			b[i] = new Books(name,author,price,numPages);
		}

		for(i = 0; i < n; i++)
		{
			System.out.println(b[i].toString());
		} 				
		
	}
}