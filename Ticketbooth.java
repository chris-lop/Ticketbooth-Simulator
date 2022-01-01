// CLASS EXPLANATION
// This class contains all attributes and methods for the objects of type ticket booth.

public class Ticketbooth {
	// ----------------------------------------
	// ATTRIBUTES SECTION
	// ----------------------------------------

	// Attribute declaration
	private Tickets tickets = new Tickets();
	private OPUSCard[] opuscards;

	// ----------------------------------------
	// METHODS SECTION
	// ----------------------------------------

	// Default Constructor
	Ticketbooth() {
	}

	// Constructor with 2 parameters that sets initial value of each attribute
	Ticketbooth(Tickets newtickets, OPUSCard[] newOpusCard) {
		tickets = newtickets;

		OPUSCard[] deepcopy = new OPUSCard[newOpusCard.length];
		for (int j = 0; j < newOpusCard.length; j++) {
			deepcopy[j] = newOpusCard[j];
		}

		opuscards = deepcopy;
	}

	// Method that returns true if total value of the tickets of two ticket booth
	// objects are equal, and false otherwise
	public Boolean equalValue(Ticketbooth ticketbooth) {
		return this.totalValue() == ticketbooth.totalValue();
	}

	// Method that will return true if number of each type of ticket of two ticket
	// booth objects are equal, and false otherwise
	public Boolean equalBreakdown(Ticketbooth ticketbooth) {
		return this.tickets.equals(ticketbooth.tickets);
	}

	// Method that returns total value of tickets in a ticket booth
	public Double totalValue() {
		return this.tickets.ticketsTotal();
	}

	// Method which will return number of OPUS cards in a ticket booth
	public Integer opusCount() {
		return opuscards.length;
	}

	// Method which will add new OPUS card to a ticket booth, and returns number of
	// OPUS cards after addition
	public Integer addOpus(String cardType, String name, int expiryMonth, int expiryYear) {
		OPUSCard[] addtemp = new OPUSCard[opuscards.length + 1];
		for (int i = 0; i < opuscards.length; i++) {
			addtemp[i] = opuscards[i];
		}
		opuscards = addtemp;
		OPUSCard opuscard = new OPUSCard(cardType, name, expiryMonth, expiryYear);
		addtemp[addtemp.length - 1] = opuscard;
		return opuscards.length;
	}

	// Method which will remove OPUS card from ticket booth (needs to account for
	// ticket booth that has no OPUS cards)
	// Returns true if removal of card was successful and false if it was not
	public Boolean removeOpus(String index) {
		if (opuscards.length == 0) {
			return false;
		} else {
			int counter = 0;
			OPUSCard[] removetemp = new OPUSCard[opuscards.length - 1];
			for (int i = 0; i < opuscards.length; i++) {
				if (i == Integer.valueOf(index))
					continue;
				removetemp[counter] = opuscards[i];
				counter++;
			}
			opuscards = removetemp;
			return true;
		}
	}

	// Method which will update expiration month and year of an OPUS card
	public void updateExpiration(int card, int newMonth, int newYear) {
		this.opuscards[card].setExpiryMonth(newMonth);
		this.opuscards[card].setExpiryYear(newYear);
	}

	// Method that adds tickets to ticket booth. Returns new total value of tickets'
	// amount in ticket booth.
	public Double addTickets(int addRegular, int addJunior, int addSenior, int addDaily, int addWeekly) {
		this.tickets.newTickets(addRegular, addJunior, addSenior, addDaily, addWeekly);
		return this.tickets.ticketsTotal();
	}

	// Equals method which returns true if total value of tickets and number of OPUS
	// card tickets of two ticket booths are equal, false otherwise.
	public Boolean equals(Ticketbooth ticketbooth) {
		if (Double.compare(this.totalValue(), ticketbooth.totalValue()) == 0
				&& this.opusCount() == ticketbooth.opusCount()) {
			return true;
		} else
			return false;
	}

	// Method that returns a string clearly indicating number of each ticket as well
	// as details of each OPUS card in ticket booth. Should work for ticket booths
	// that
	// have no OPUS cards
	public String toString() {

		String temporary = "\n";
		if (this.opuscards.length == 0) {
			return this.tickets.toString();
		} else {
			for (int i = 0; i < opuscards.length; i++) {
				temporary += this.opuscards[i].toString();
				temporary += "\n";
			}
			return this.tickets.toString() + temporary;
		}

	}

	// Method that returns string with just breakdown of tickets
	public String ticketBreakdown() {
		return this.tickets.toString();
	}

}
