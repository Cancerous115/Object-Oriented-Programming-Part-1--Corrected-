import java.time.LocalDate;

class Main {
  public static void main(String[] args) {
  //we can remove user.name = "Sammy caliback"; and user.birthDay= LocalDate.parse("1996-01-20"); once we add them to our User user= new User inside the parenthesis.
//Ex:   User user = new User("Sammy caliback","1996-01-20");
 	User user = new User("Sammy caliback","1996-01-20");
	Book book = new Book("The User Illusion","Tor Norretranders",500);
	AudioBook = new AudioBook("Frankenstein's Monster","Mary Wollstonecraft",25000);
	
	System.out.printf("%s was born %s\n",user.getName(),user.getBirthDay());
	//Insert the book title and authors name either by inserting into our String, or inserting it on line 6 "Book.java" file.
	System.out.printf("%s has borrowed these books:%s by %s.\n",user.getName(),book.title,book.author);
		
  }
}