import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
//import class to calculate import java.time.Period;

//Using different methods
public class User{
	public String name;
	public LocalDate birthDay;
	
	public ArrayList<Book> book=new ArrayList<Book>();

	//Asking for a name variable and storing it in the user class also we are asking for a birthday and storing it in the User class.
	User(String name,String birthDay){
		this.name= name;
		this.birthDay= LocalDate.parse(birthDay);
	} 

	public String getName(){
		return this.name;
	}
	public String getBirthDay(){
		return this.birthDay.toString();
	}
	
	public void borrow(Book book){
		this.book.add(book);
		
	}
//Between method to calculate the different between two local date times.
//Return type method for age which will be int. 
	
}