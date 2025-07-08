import java.util.*;
public class library_management {

	public static void Main (String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();// number of books in Library
		int m=sc.nextInt();// number of members in library
		int q=sc.nextInt();// number of queries
		Library l=new Library(n,m);
		for(int i=0;i<n;i++) {
			String title=sc.next();
			String author=sc.next();
			int bookID=sc.nextInt();
			l.addBook(new Book(title,author,bookID));
		}
		for(int i=0;i<m;i++) {
			char ch=sc.next().charAt(0);
			if(ch=='p') {
				String name=sc.next();
				int id=sc.nextInt();
				l.addMember(new PremiumMember(name,id));
			}
			else {
				String name=sc.next();
				int id=sc.nextInt();
				l.addMember(new RegularMember(name,id));
			}
		}
		for(int i=0;i<q;i++) {
			int bid=sc.nextInt();
			int mid=sc.nextInt();
			Member mem=l.getMember(mid);
			Book bk=l.getBook(bid);
			mem.borrowBook(bk);
		}
		l.listAvailableBooks();
	}

}

class Library {
    private Book[] books;
    private Member[] members;
    private int bookCount;
    private int memberCount;

    public Library(int maxBooks, int maxMembers) {
        this.books = new Book[maxBooks];
        this.members = new Member[maxMembers];
        this.bookCount = 0;
        this.memberCount = 0;
    }

    public void addBook(Book book) {
        if (bookCount < books.length) {
            books[bookCount] = book;
            bookCount++;
        } else {
            System.out.println("Library is full, cannot add more books.");
        }
    }

    public void addMember(Member member) {
        if (memberCount < members.length) {
            members[memberCount] = member;
            memberCount++;
        } else {
            System.out.println("Library is full, cannot add more members.");
        }
    }

    public void listAvailableBooks() {
        System.out.println("Available Books:");
        for (int i = 0; i < bookCount; i++) {
            if (books[i].isAvailable()) {
                System.out.println(books[i].getDetails());
            }
        }
    }
    public Member getMember(int id) {
    	for(Member m :members) {
    		if(m.getId()==id) {
    			return m;
    		}
    	}
    	return null;
    }
    public Book getBook(int id) {
    	for(Book b :books) {
    		if(b.getBookId()==id) {
    			return b;
    		}
    	}
    	return null;
    }
}
class Book {
    private String title;
    private String author;
    private int bookId;
    private boolean available;

    public Book(String title, String author, int bookId) {
        this.title = title;
        this.author = author;
        this.bookId = bookId;
        this.available = true;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getBookId() {
        return bookId;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailability(boolean status) {
        this.available = status;
    }

    public String getDetails() {
        String status = available ? "Available" : "Not Available";
        return String.format("Title: %s, Author: %s, ID: %s, Status: %s", title, author, bookId, status);
    }
}
class Member {
    protected String name;
    protected int memberId;
    protected Book[] borrowedBooks;
    protected int borrowedCount;

    public Member(String name, int memberId, int maxBooks) {
        this.name = name;
        this.memberId = memberId;
        this.borrowedBooks = new Book[maxBooks];
        this.borrowedCount = 0;
    }
    public int getId() {
    	return memberId;
    }

    public void borrowBook(Book book) {
        if (borrowedCount < borrowedBooks.length) {
            if (book.isAvailable()) {
                borrowedBooks[borrowedCount] = book;
                borrowedCount++;
                book.setAvailability(false);
                System.out.println(name + " borrowed '" + book.getTitle() + "'");
            } else {
                System.out.println("'" + book.getTitle() + "' is currently not available.");
            }
        } else {
            System.out.println(name + " cannot borrow more books.");
        }
    }

    public void returnBook(Book book) {
        boolean found = false;
        for (int i = 0; i < borrowedCount; i++) {
            if (borrowedBooks[i] == book) {
                borrowedBooks[i] = borrowedBooks[borrowedCount - 1]; // Replace the returned book with the last borrowed book
                borrowedBooks[borrowedCount - 1] = null; // Clear the last borrowed book
                borrowedCount--;
                book.setAvailability(true);
                System.out.println(name + " returned '" + book.getTitle() + "'");
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println(name + " did not borrow '" + book.getTitle() + "'.");
        }
    }

    public String getDetails() {
        StringBuilder borrowedTitles = new StringBuilder();
        if (borrowedCount == 0) {
            borrowedTitles.append("No books borrowed.");
        } else {
            for (int i = 0; i < borrowedCount; i++) {
                borrowedTitles.append(borrowedBooks[i].getTitle()).append(", ");
            }
            borrowedTitles.setLength(borrowedTitles.length() - 2); // Remove trailing comma
        }
        return String.format("Member Name: %s, Member ID: %s, Borrowed Books: %s", name, memberId, borrowedTitles.toString());
    }
}
class RegularMember extends Member {
    private static final int MAX_BOOKS = 3;

    public RegularMember(String name, int memberId) {
        super(name, memberId, MAX_BOOKS);
    }
}
class PremiumMember extends Member {
    private static final int MAX_BOOKS = 6;

    public PremiumMember(String name, int memberId) {
        super(name, memberId, MAX_BOOKS);
    }
}