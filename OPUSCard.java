// CLASS EXPLANATION
// This class contains all attributes and methods for the objects of type OPUS card.

public class OPUSCard {
	// ----------------------------------------
	// ATTRIBUTES SECTION
	// ----------------------------------------

	// Attribute declaration
	private String cardType, name;
	private int expiryMonth, expiryYear;

	// ----------------------------------------
	// METHODS SECTION
	// ----------------------------------------

	// Default Constructor
	OPUSCard() {
	}

	// Constructor with 4 parameters to set the initial value of each attribute (if
	// month is not between 1 and 12, set it to 0)
	OPUSCard(String newCardType, String newName, int newExpiryMonth, int newExpiryYear) {
		cardType = newCardType;
		name = newName;
		expiryMonth = newExpiryMonth;
		expiryYear = newExpiryYear;
	}

	// Copy constructor of one parameter of type OPUSCard
	OPUSCard(OPUSCard copy) {
		cardType = copy.cardType;
		name = copy.name;
		expiryMonth = copy.expiryMonth;
		expiryYear = copy.expiryYear;
	}

	// Getters methods for all attributes
	public String getCardType() {
		return cardType;
	}

	public String getName() {
		return name;
	}

	public Integer getExpiryMonth() {
		return expiryMonth;
	}

	public Integer getExpiryYear() {
		return expiryYear;
	}

	// Setters (mutator) methods for expiration month and expiration year. If
	// expiration month is not between 1 and 12, sets it to 0.
	public void setExpiryMonth(int expiryMonth) {
		if (expiryMonth >= 1 && expiryMonth <= 12) {
			this.expiryMonth = expiryMonth;
		} else
			this.expiryMonth = 0;
	}

	public void setExpiryYear(int expiryYear) {
		this.expiryYear = expiryYear;
	}

	// Method which will return a string indicating the type of OPUS card, the name
	// of the owner, as well as the expiration date formated as mm/yyyy.
	// If month number is less than 10, then it is preceded by a zero.
	public String toString() {
		if (expiryMonth < 10) {
			return this.cardType + " - " + this.name + " - 0" + this.expiryMonth + "/" + this.expiryYear;
		} else {
			return this.cardType + " - " + this.name + " - " + this.expiryMonth + "/" + this.expiryYear;
		}

	}

	// Equals method which will return true if two objects of type OPUSCard are
	// identical
	public Boolean equals(OPUSCard newCard) {
		if (this.cardType == newCard.getCardType() && this.name == newCard.getName()
				&& this.expiryMonth == newCard.getExpiryMonth() && this.expiryYear == newCard.getExpiryYear()) {
			return true;
		} else
			return false;

	}

}
