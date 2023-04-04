import java.time.LocalDate;

class Main {
  public static void main(String[] args) {
    User youngerUser = new User();

		youngerUser.name = "Sammy caliback";
		youngerUser.birthDay= LocalDate.parse("1996-01-20");

		System.out.printf("%s was born %s",youngerUser.name,youngerUser.birthDay.toString());
		
  }
}