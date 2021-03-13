package ticket;

public class Ticket {
	
	private String ticketNum;
	private String movieName;
	private int ticketPrice;
	private int movieTime;
	
	public Ticket() {};
	
	public Ticket(String ticketNum, String movieName, int ticketPrice, int movieTime) {
		this.ticketNum = ticketNum;
		this.movieName = movieName;
		this.ticketPrice = ticketPrice;
		this.movieTime = movieTime;
	}


	public String getTicketNum() {
		return ticketNum;
	}

	public String getMovieName() {
		return movieName;
	}

	public int getTicketPrice() {
		return ticketPrice;
	}

	public int getMovieTime() {
		return movieTime;
	}

	public void setTicketNum(String ticketNum) {
		this.ticketNum = ticketNum;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public void setTicketPrice(int ticketPrice) {
		this.ticketPrice = ticketPrice;
	}

	public void setMovieTime(int movieTime) {
		this.movieTime = movieTime;
	}
	

}
