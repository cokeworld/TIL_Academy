package ticket;

public class MainManager {
	public void run() {
		TicketList ticket = new TicketList();
		UserList user = new UserList();

		user.kim.buyTicket(ticket.star2_morning);
		user.na.buyTicket(ticket.theKing);
		
		System.out.println(user.kim.searchMovie().getMovieName());
		System.out.println(user.na.searchMovie().getMovieName());
		
		System.out.println(user.kim.checkMoney());
		System.out.println(user.na.checkMoney());
	}
}
