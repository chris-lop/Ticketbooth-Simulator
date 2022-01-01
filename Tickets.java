// CLASS EXPLANATION
// This class contains all attributes and methods for the objects of type tickets.

public class Tickets {
	//----------------------------------------
	// ATTRIBUTES SECTION
	//----------------------------------------
	
	// Attribute declaration
	private int regularNb, juniorNb, seniorNb, dailyNb, weeklyNb;
	
	
	// Static Constants for inventory evaluation (PRICES)
	final double REGULAR = 3.50, JUNIOR = 2.50, SENIOR = 1, DAILY = 10, WEEKLY = 40;
	
	
	//----------------------------------------
	// METHODS SECTION
	//----------------------------------------
	
	// Default Constructor
	
	Tickets() {}
	
	// Constructor with  5 integer parameters to set number of each ticket in ticket booth
	Tickets(int newRegularNb, int newJuniorNb, int newSeniorNb, int newDailyNb, int newWeeklyNb) {
		regularNb = newRegularNb;
		juniorNb = newJuniorNb;
		seniorNb = newSeniorNb;
		dailyNb = newDailyNb;
		weeklyNb = newWeeklyNb;
	}
	
	// Getter methods for non-constant attributes
	public Integer getRegular() {
		return regularNb;
	}
	
	public Integer getJunior() {
		return juniorNb;
	}
	
	public Integer getSenior() {
		return seniorNb;
	}
	
	public Integer getDaily() {
		return dailyNb;
	}
	
	public Integer getWeekly() {
		return weeklyNb;
	}
	
	// Setter (mutator) methods for non-constant attributes
	public void setRegular(int regularNb) {
		this.regularNb = regularNb;
	}
	
	public void setJunior(int juniorNb) {
		this.juniorNb = juniorNb;
	}
	
	public void setSenior(int seniorNb) {
		this.seniorNb = seniorNb;
	}
	
	public void setDaily(int dailyNb) {
		this.dailyNb = dailyNb;
	}
	
	public void setWeekly(int weeklyNb) {
		this.weeklyNb = weeklyNb;
	}
	
	// Method that allows one to increase the number of each tickets by the indicated number
	public void newTickets(int newRegularNb, int newJuniorNb, int newSeniorNb, int newDailyNb, int newWeeklyNb) {
		regularNb = regularNb+newRegularNb;
		juniorNb = juniorNb+newJuniorNb;
		seniorNb = seniorNb+newSeniorNb;
		dailyNb = dailyNb+newDailyNb;
		weeklyNb = weeklyNb+newWeeklyNb;
	}
	
	// Method which returns a double indicating the total value of the tickets in the ticket booth
	public Double ticketsTotal() {
		return (this.regularNb*this.REGULAR)+(this.juniorNb*this.JUNIOR)+(this.seniorNb*this.SENIOR)+(this.dailyNb*this.DAILY)+(this.weeklyNb*this.WEEKLY);
	}
	
	// Method which will return a string clearly indicating the count of each ticket in the ticket booth
	public String toString() {
		return this.regularNb+" x $"+this.REGULAR+" + "+this.juniorNb+" x $"+this.JUNIOR+" + "+this.seniorNb+" x $"+this.SENIOR+" + "+this.dailyNb+" x $"+this.DAILY+" + "+this.weeklyNb+" x $"+this.WEEKLY;
	}
	
	// Method which will return true if the two objects of type Tickets being compared have the same breakdown of tickets and false otherwise
	public Boolean equals(Tickets tickets) {
		if (this.regularNb == tickets.getRegular() && this.juniorNb == tickets.getJunior() && this.seniorNb == tickets.getSenior() && this.dailyNb == tickets.getDaily() && this.weeklyNb == tickets.getWeekly()) {
			return true;
		} else return false;
	}
	
}
