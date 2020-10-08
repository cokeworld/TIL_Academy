package ticket;

public class User {
	
	private String userId;
	private String userPw;
	private String name;
	private String phoneNum;
	private int money;
	Ticket ticket;
	
	// constructor
	public User(String userId, String userPw, String name, String phoneNum, int money) {
		super();
		this.userId = userId;
		this.userPw = userPw;
		this.name = name;
		this.phoneNum = phoneNum;
		this.money = money;
	}
	
	// method
	public void buyTicket(Ticket ticket) {
		this.ticket = ticket;
		money = money - ticket.getTicketPrice();
	}
	
	public Ticket searchMovie() {
		return ticket;
	}
	
	public int checkMoney() {
		return money;
	}

}
