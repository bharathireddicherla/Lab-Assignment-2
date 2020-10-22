import java.util.Scanner;
class Book
{
	String bookTitle;
	String author;
	String ISBN;
	int numOfCopies;
	Book bk;
	Book(String bookTitle , String author , String ISBN , int numOfCopies)
	{
		this.bookTitle = bookTitle;
		this.author = author;
		this.ISBN = ISBN;
		this.numOfCopies = numOfCopies;
	}
	Book(Book bk)
	{
		this.bk = bk;
	}
	Book()
	{
	}
	Book book_Matched()
	{
		return bk;
	}
	Book book_Not_Matched(String ISBN , int qnt)
	{
		Scanner s = new Scanner(System.in);
		this.ISBN = ISBN;
		System.out.println("Book not Matched , New book has to order \n");
		System.out.print("Title : ");
	    String title1 = s.nextLine();
		System.out.print("Author : ");
		String author = s.nextLine();
		Book b = new Book(title1 , author , ISBN , qnt);
		return b;

	}
	void display(Book bk)
	{
		System.out.println(bk.bookTitle+"-"+bk.author+"-"+bk.ISBN+"-"+bk.numOfCopies);
	}
	boolean order_check(String bnum , int num)
	{
		
		if(bnum.equals(bk.ISBN))
		{
			bk.numOfCopies+=num;
			return true;
		}
		else
		{
			return false;
		}
	}
	boolean sell_check(String bnum , int num)
	{
		if(bnum.equals(bk.ISBN))
		{
			bk.numOfCopies-=num;
			if(bk.numOfCopies>0)
			{
				return true;
			}
			else
			{
				bk.numOfCopies +=num;
				return false;
			}
		}
		else
		{
			return false;
		}
	}
}
class BookStore
{
	public Book books[] = new Book[10];
	void bookArray(Book b , int z)
	{
		books[z] = b;
	}
	void bo() throws Exception
	{
		display(books);
	}
	void display(Book books[])
	{
		for(int i=0;i<books.length;i++)
		{
			Book bks = new Book(books[i]);
			bks.display(books[i]);
		}
	}
	int sell(String bnum , int num ,int total_books)
	{
		boolean book_match = false;
		for(int i=0;i<total_books;i++)
		{
			Book bks = new Book(books[i]);
			book_match = bks.sell_check(bnum , num);
			if(book_match==true)
			{
				books[i]=bks.book_Matched();
				return total_books;
			}
		}
		System.out.println("sorry the book you are looking is OUT OF STOCK ");
		return total_books;
	}
	int order(String bnum , int num , int total_books)
	{
		boolean book_match=false;
		for(int i=0;i<total_books;i++)
		{
			Book bks = new Book(books[i]);
			book_match = bks.order_check(bnum , num);
			if(book_match==true)
			{
				books[i]=bks.book_Matched();
				return total_books;
			}
			Book bks = new Book();
			books[total_books]=bks.book_Not_Matched(bnum , num);
			total_books++;
			return total_books;
			}

}
class ExamBookStore 
{
	static int total_books;
	public static void main(String[] args) 
	{
		try
		{	
			Scanner s = new Scanner(System.in);
			int open=11;
			BookStore bs = new BookStore();
			System.out.println("enter no.of books to store : ");
			total_books = s.nextInt();
			for(int i=0;i<total_books;i++)
			{
				System.out.print("Title : ");
				String title = s.nextLine();
				String title1 = s.nextLine();
				System.out.print("Author : ");
				String author = s.nextLine();
				System.out.print("ISBN : ");
				String ISBN = s.next();
				System.out.print("quantity : ");
				int qnt = s.nextInt();
				Book b = new Book(title1 , author , ISBN , qnt);
				bs.bookArray(b , i);
			}
			checkPoint(bs);
		}
		catch (Exception e)
		{
		}
	}
    public static void checkPoint(BookStore bs)
	{
		try	
		{
			Scanner s = new Scanner(System.in);
			int open=11;
			while(open!=0)
			{
				System.out.println("enter\n 1) to display books\n 2)to order\n 3)to sell books\n 0)to exit \n ");
				open = s.nextInt();
				if(open == 1)
				{
					bs.bo();
					
				}
				else if(open == 2)
				{
					System.out.print("enter ISBN :");
					String bn1 = s.nextLine();
					String bn = s.nextLine();
					System.out.println("how many copies :");
					int num = s.nextInt();
					total_books=bs.order(bn , num , total_books);
				}
				else if(open==3)
				{
					System.out.print("enter ISBN :");
					String bn1 = s.nextLine();
					String bn = s.nextLine();
					System.out.println("how many copies :");
					int num = s.nextInt();
					total_books=bs.sell(bn , num , total_books);
				}
				else if(open == 0)
				{
					System.out.println("thank you ! ");
					open=0;
				}
			}
		}
		catch(Exception e)
		{
			checkPoint(bs);			
		}
	}
}