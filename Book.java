public class Book {
	public String title;
	public String author;
	private int pageCount;

	Book(String title,String author,int pageCount){
		this.title=title;
		this.author=author;
		this.pageCount=pageCount;
	}

	public String getTitle(){
		return this.title;
	}
	public String getAuthor(){
		return this.author;
	}
	//We can insert this return to have our output show the book title and authors namepublic String toString(){
		public String toString(){
			return String.format("%s by %s", this.title,this.author,this.pageCount);
	}
}