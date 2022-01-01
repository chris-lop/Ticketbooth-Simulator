// -------------------------------------------------------
// Assignment 4
// Written by: Christopher Lopez, 40199547
// For COMP 248 Section R � Fall 2021
// --------------------------------------------------------

import java.util.Scanner;

public class driver {

	public static void main(String[] args) {
		// ----------------------------------
		// TEST TICKET BOOTHS SECTION
		// This is where the 5 sample ticket booths
		// are created to test all the methods
		// ----------------------------------

		// Tickets constructors
		Tickets ticket1 = new Tickets(0, 0, 10, 0, 0);
		Tickets ticket2 = new Tickets(0, 0, 10, 0, 0);
		Tickets ticket3 = new Tickets(0, 0, 0, 1, 0);
		Tickets ticket4 = new Tickets(1, 1, 1, 0, 0);
		Tickets ticket5 = new Tickets(1, 1, 1, 0, 0);

		// OPUS card constructors
		OPUSCard card1 = new OPUSCard("REM", "name1", 1, 2000);
		OPUSCard card2 = new OPUSCard("REM", "name2", 2, 2000);
		OPUSCard card3 = new OPUSCard("REM", "name3", 3, 2000);
		OPUSCard card4 = new OPUSCard("REM", "name4", 4, 2000);
		OPUSCard card5 = new OPUSCard("REM", "name5", 12, 2000);

		// OPUS card arrays
		OPUSCard[] opus1 = { card1 };
		OPUSCard[] opus2 = { card2 };
		OPUSCard[] opus3 = { card3, card4, card5 };
		OPUSCard[] opus4 = new OPUSCard[0];
		OPUSCard[] opus5 = new OPUSCard[0];

		// Ticket booth constructors
		Ticketbooth booth1 = new Ticketbooth(ticket1, opus1);
		Ticketbooth booth2 = new Ticketbooth(ticket2, opus2);
		Ticketbooth booth3 = new Ticketbooth(ticket3, opus3);
		Ticketbooth booth4 = new Ticketbooth(ticket4, opus4);
		Ticketbooth booth5 = new Ticketbooth(ticket5, opus5);

		// ----------------------------------
		// USER MENU AND ACTIONS SECTION
		// ----------------------------------

		// Variable declaration
		String actionNb;
		Scanner keyboard = new Scanner(System.in);

		// Welcome Message
		System.out.println("Welcome User");

		// Loop that displays user choices
		while (true) {

			// User menu
			System.out.println();
			System.out.println("What would you like to do?");
			System.out.println("1. See the content of all Ticketbooths");
			System.out.println("2. See the content of one Ticketbooth");
			System.out.println("3. List Ticketbooths with same amount of tickets' values");
			System.out.println("4. List Ticketbooths with same Tickets amount");
			System.out.println("5. List Ticketbooths with same amount of tickets values and same number of OPUS cards");
			System.out.println("6. Add a OPUS card to an existing Ticketbooth");
			System.out.println("7. Remove an existing OPUS card from a Ticketbooth");
			System.out.println("8. Update the expiry date of an existing OPUS card");
			System.out.println("9. Add Tickets to a Ticketbooth");
			System.out.println("0. To quit");
			System.out.println();

			// Input of user's choice
			System.out.println("Please enter your choice and press <Enter>:");
			actionNb = keyboard.next();

			// Switch case for instructions based on user choice
			switch (actionNb) {

				// Option 1: Displays tickets and OPUS cards of each ticket booth.
				case "1":
					System.out.println("Content of each Ticketbooth:");
					System.out.println("----------------");
					System.out.println("Ticketbooth #1:");
					System.out.println(booth1.toString());
					System.out.println();

					System.out.println("Ticketbooth #2:");
					System.out.println(booth2.toString());
					System.out.println();

					System.out.println("Ticketbooth #3:");
					System.out.println(booth3.toString());
					System.out.println();

					System.out.println("Ticketbooth #4:");
					System.out.println(booth4.toString());
					System.out.println();

					System.out.println("Ticketbooth #5:");
					System.out.println(booth5.toString());
					System.out.println();
					break;

				// Option 2: Asks user which ticket booth they wish to see the content of, and
				// displays tickets and OPUS cards of chosen ticket booth.
				case "2":

					// Inner loop to validate user input
					boolean loop = true;
					while (loop) {

						// Switch case to determine which ticket booth user wants to see content of
						String boothNb;
						System.out
								.println("Which Ticketbooth do you want to see the content of? (Enter number 1 to 5):");
						boothNb = keyboard.next();
						switch (boothNb) {

							// Option 1: Displays tickets and OPUS cards of ticket booth 1
							case "1":
								System.out.println(booth1.toString());
								loop = false;
								break;

							// Option 2: Displays tickets and OPUS cards of ticket booth 2
							case "2":
								System.out.println(booth2.toString());
								loop = false;
								break;

							// Option 3: Displays tickets and OPUS cards of ticket booth 3
							case "3":
								System.out.println(booth3.toString());
								loop = false;
								break;

							// Option 4: Displays tickets and OPUS cards of ticket booth 4
							case "4":
								System.out.println(booth4.toString());
								loop = false;
								break;

							// Option 5: Displays tickets and OPUS cards of ticket booth 5
							case "5":
								System.out.println(booth5.toString());
								loop = false;
								break;

							// Default option in order to validate user input
							default:
								System.out.println("Sorry, this booth does not exist. Try again.");
								break;
						}
					}
					break;

				// Option 3: Compare all ticket booths and display those pairs that have same
				// total tickets' amount along with the $ amount
				case "3":
					boolean pairs = true;

					// If statements to compare all combinations of ticket booths based on total
					// value
					if (Double.compare(booth1.totalValue(), booth2.totalValue()) == 0) {
						System.out.println("Ticketbooths 1 and 2 both have " + booth1.totalValue());
						pairs = false;
					}
					if (Double.compare(booth1.totalValue(), booth3.totalValue()) == 0) {
						System.out.println("Ticketbooths 1 and 3 both have " + booth1.totalValue());
						pairs = false;
					}
					if (Double.compare(booth1.totalValue(), booth4.totalValue()) == 0) {
						System.out.println("Ticketbooths 1 and 4 both have " + booth1.totalValue());
						pairs = false;
					}
					if (Double.compare(booth1.totalValue(), booth5.totalValue()) == 0) {
						System.out.println("Ticketbooths 1 and 5 both have " + booth1.totalValue());
						pairs = false;
					}
					if (Double.compare(booth2.totalValue(), booth3.totalValue()) == 0) {
						System.out.println("Ticketbooths 2 and 3 both have " + booth2.totalValue());
						pairs = false;
					}
					if (Double.compare(booth2.totalValue(), booth4.totalValue()) == 0) {
						System.out.println("Ticketbooths 2 and 4 both have " + booth2.totalValue());
						pairs = false;
					}
					if (Double.compare(booth2.totalValue(), booth5.totalValue()) == 0) {
						System.out.println("Ticketbooths 2 and 5 both have " + booth2.totalValue());
						pairs = false;
					}
					if (Double.compare(booth3.totalValue(), booth4.totalValue()) == 0) {
						System.out.println("Ticketbooths 3 and 4 both have " + booth3.totalValue());
						pairs = false;
					}
					if (Double.compare(booth3.totalValue(), booth5.totalValue()) == 0) {
						System.out.println("Ticketbooths 3 and 5 both have " + booth3.totalValue());
						pairs = false;
					}
					if (Double.compare(booth4.totalValue(), booth5.totalValue()) == 0) {
						System.out.println("Ticketbooths 4 and 5 both have " + booth4.totalValue());
						pairs = false;
					}

					// If statement that runs only if no ticket booths have the same total value
					if (pairs == true)
						System.out.println("There are no ticketbooths with the same total value.");
					break;

				// Option 4: Compares all ticket booths and display the pairs that have the same
				// ticket distribution
				case "4":
					boolean noPairs = true;

					// If statements to compare all combinations of ticket booths based on ticket
					// breakdown
					if (booth1.equalBreakdown(booth2)) {
						System.out.println("Ticketbooths 1 and 2 both have " + booth1.ticketBreakdown());
						noPairs = false;
					}
					if (booth1.equalBreakdown(booth3)) {
						System.out.println("Ticketbooths 1 and 3 both have " + booth1.ticketBreakdown());
						noPairs = false;
					}
					if (booth1.equalBreakdown(booth4)) {
						System.out.println("Ticketbooths 1 and 4 both have " + booth1.ticketBreakdown());
						noPairs = false;
					}
					if (booth1.equalBreakdown(booth5)) {
						System.out.println("Ticketbooths 1 and 5 both have " + booth1.ticketBreakdown());
						noPairs = false;
					}
					if (booth2.equalBreakdown(booth3)) {
						System.out.println("Ticketbooths 2 and 3 both have " + booth2.ticketBreakdown());
						noPairs = false;
					}
					if (booth2.equalBreakdown(booth4)) {
						System.out.println("Ticketbooths 2 and 4 both have " + booth2.ticketBreakdown());
						noPairs = false;
					}
					if (booth2.equalBreakdown(booth5)) {
						System.out.println("Ticketbooths 2 and 5 both have " + booth2.ticketBreakdown());
						noPairs = false;
					}
					if (booth3.equalBreakdown(booth4)) {
						System.out.println("Ticketbooths 3 and 4 both have " + booth3.ticketBreakdown());
						noPairs = false;
					}
					if (booth3.equalBreakdown(booth5)) {
						System.out.println("Ticketbooths 3 and 5 both have " + booth3.ticketBreakdown());
						noPairs = false;
					}
					if (booth4.equalBreakdown(booth5)) {
						System.out.println("Ticketbooths 4 and 5 both have " + booth4.ticketBreakdown());
						noPairs = false;
					}

					// If statement that runs only if no ticket booths have the same ticket
					// distribution
					if (noPairs == true)
						System.out.println("There are no Ticketbooths with the same ticket distribution.");

					System.out.println();
					break;

				// Option 5: Lists all ticket booth pairs that are equal based on the definition
				// of equal in the class ticket booth
				case "5":
					boolean equal = true;
					System.out.println(
							"List of Ticketbooths with same amount of tickets values and same number of OPUS cards:");
					System.out.println();

					// If statements to compare all combinations of ticket booths based on equals
					// method in ticket booth class
					if (booth1.equals(booth2)) {
						System.out.println("Ticketbooths 1 and 2");
						equal = false;
					}
					if (booth1.equals(booth3)) {
						System.out.println("Ticketbooths 1 and 3");
						equal = false;
					}
					if (booth1.equals(booth4)) {
						System.out.println("Ticketbooths 1 and 4");
						equal = false;
					}
					if (booth1.equals(booth5)) {
						System.out.println("Ticketbooths 1 and 5");
						equal = false;
					}
					if (booth2.equals(booth3)) {
						System.out.println("Ticketbooths 2 and 3");
						equal = false;
					}
					if (booth2.equals(booth4)) {
						System.out.println("Ticketbooths 2 and 4");
						equal = false;
					}
					if (booth2.equals(booth5)) {
						System.out.println("Ticketbooths 2 and 5");
						equal = false;
					}
					if (booth3.equals(booth4)) {
						System.out.println("Ticketbooths 3 and 4");
						equal = false;
					}
					if (booth3.equals(booth5)) {
						System.out.println("Ticketbooths 3 and 5");
						equal = false;
					}
					if (booth4.equals(booth5)) {
						System.out.println("Ticketbooths 4 and 5");
						equal = false;
					}

					// If statement that runs only if no ticket booths are equal
					if (equal == true)
						System.out.println(
								"There are no ticketbooths with the same amount of tickets values and same number of OPUS cards");
					break;

				// Option 6: Ask the user which ticket booth they want to add an OPUS card to,
				// as well as the OPUS card information, created the new OPUS card and adds it
				// to the ticket booth
				case "6":

					// Inner loop to validate user input
					boolean loop2 = true;
					while (loop2) {

						// Switch case to determine which ticket booth user wants to add an OPUS card to
						String boothNb, cardType, name;
						int expiryMonth, expiryYear;
						System.out
								.println("Which Ticketbooth do you want to add a OPUS card to? (Enter number 1 to 5):");
						boothNb = keyboard.next();
						switch (boothNb) {

							// Option 6.1: Adds OPUS card to booth 1
							case "1":

								// Asks for user information input for new OPUS card information
								System.out.println(
										"Please enter the following information so that we may complete the transaction:");
								System.out.println("---> Type of OPUS card (STL, RTL, etc ..):");
								cardType = keyboard.next();
								keyboard.nextLine();

								System.out.println("---> Type full name on OPUS card:");
								name = keyboard.nextLine();

								System.out.println("---> Expiry month number:");
								expiryMonth = keyboard.nextInt();

								System.out.println("---> Expiry year number:");
								expiryYear = keyboard.nextInt();

								// Creates new OPUS card
								booth1.addOpus(cardType, name, expiryMonth, expiryYear);
								loop2 = false;
								break;

							// Option 6.2: Adds OPUS card to booth 2
							case "2":
								// Asks for user information input for new OPUS card information
								System.out.println(
										"Please enter the following information so that we may complete the transaction:");
								System.out.println("---> Type of OPUS card (STL, RTL, etc ..):");
								cardType = keyboard.next();
								keyboard.nextLine();

								System.out.println("---> Type full name on OPUS card:");
								name = keyboard.nextLine();

								System.out.println("---> Expiry month number:");
								expiryMonth = keyboard.nextInt();

								System.out.println("---> Expiry year number:");
								expiryYear = keyboard.nextInt();

								// Creates new OPUS card
								booth2.addOpus(cardType, name, expiryMonth, expiryYear);
								loop2 = false;
								break;

							// Option 6.3: Adds OPUS card to booth 3
							case "3":
								// Asks for user information input for new OPUS card information
								System.out.println(
										"Please enter the following information so that we may complete the transaction:");
								System.out.println("---> Type of OPUS card (STL, RTL, etc ..):");
								cardType = keyboard.next();
								keyboard.nextLine();

								System.out.println("---> Type full name on OPUS card:");
								name = keyboard.nextLine();

								System.out.println("---> Expiry month number:");
								expiryMonth = keyboard.nextInt();

								System.out.println("---> Expiry year number:");
								expiryYear = keyboard.nextInt();

								// Creates new OPUS card
								booth3.addOpus(cardType, name, expiryMonth, expiryYear);
								loop2 = false;
								break;

							// Option 6.4: Adds OPUS card to booth 4
							case "4":
								// Asks for user information input for new OPUS card information
								System.out.println(
										"Please enter the following information so that we may complete the transaction:");
								System.out.println("---> Type of OPUS card (STL, RTL, etc ..):");
								cardType = keyboard.next();
								keyboard.nextLine();

								System.out.println("---> Type full name on OPUS card:");
								name = keyboard.nextLine();

								System.out.println("---> Expiry month number:");
								expiryMonth = keyboard.nextInt();

								System.out.println("---> Expiry year number:");
								expiryYear = keyboard.nextInt();

								// Creates new OPUS card
								booth4.addOpus(cardType, name, expiryMonth, expiryYear);
								loop2 = false;
								break;

							// Option 6.5: Adds OPUS card to booth 5
							case "5":
								// Asks for user information input for new OPUS card information
								System.out.println(
										"Please enter the following information so that we may complete the transaction:");
								System.out.println("---> Type of OPUS card (STL, RTL, etc ..):");
								cardType = keyboard.next();
								keyboard.nextLine();

								System.out.println("---> Type full name on OPUS card:");
								name = keyboard.nextLine();

								System.out.println("---> Expiry month number:");
								expiryMonth = keyboard.nextInt();

								System.out.println("---> Expiry year number:");
								expiryYear = keyboard.nextInt();

								// Creates new OPUS card
								booth5.addOpus(cardType, name, expiryMonth, expiryYear);
								loop2 = false;
								break;

							// Default option in order to validate user input
							default:
								System.out.println("Sorry, this booth does not exist. Try again.");
								break;
						}
					}
					break;

				// Option 7: Asks user which ticket booth they want to remove an OPUS card from,
				// as well as the card index they want removed, and removes it from the booth
				case "7":
					// Inner loop to validate user input
					boolean loop3 = true;
					while (loop3) {

						// Switch case to determine which ticket booth user wants to remove an OPUS card
						// from
						String boothNb;
						String cardNb;

						System.out.println(
								"Which Ticketbooth do you want to remove an OPUS card from? (Enter number 1 to 5):");
						boothNb = keyboard.next();
						switch (boothNb) {

							// Option 7.1: Removes OPUS card from booth 1
							case "1":

								// Checks if Ticket booth has 0 cards
								if (booth1.opusCount() == 0) {
									System.out.println("Sorry, that Ticketbooth has no cards.");
									break;
								} else {

									// Asks which card the user wants to remove based on array index
									System.out.println(
											"Enter card number you wish to remove (Enter card number from 0 to "
													+ (booth1.opusCount() - 1) + ")");
									cardNb = keyboard.next();

									// Removes designated card and exits loop
									booth1.removeOpus(cardNb);
									System.out.println("Card was removed successfully");
									loop3 = false;
									break;
								}

								// Option 7.2: Removes OPUS card from booth 2
							case "2":

								// Checks if Ticket booth has 0 cards
								if (booth2.opusCount() == 0) {
									System.out.println("Sorry, that Ticketbooth has no cards.");
									break;
								} else {

									// Asks which card the user wants to remove based on array index
									System.out.println(
											"Enter card number you wish to remove (Enter card number from 0 to "
													+ (booth2.opusCount() - 1) + ")");
									cardNb = keyboard.next();

									// Removes designated card and exits loop
									booth2.removeOpus(cardNb);
									System.out.println("Card was removed successfully");
									loop3 = false;
									break;
								}

								// Option 7.3: Removes OPUS card to booth 3
							case "3":

								// Checks if Ticket booth has 0 cards
								if (booth3.opusCount() == 0) {
									System.out.println("Sorry, that Ticketbooth has no cards.");
									break;
								} else {
									// Asks which card the user wants to remove based on array index
									System.out.println(
											"Enter card number you wish to remove (Enter card number from 0 to "
													+ (booth3.opusCount() - 1) + ")");
									cardNb = keyboard.next();

									// Removes designated card and exits loop
									booth3.removeOpus(cardNb);
									System.out.println("Card was removed successfully");
									loop3 = false;
									break;
								}

								// Option 7.4: Removes OPUS card to booth 4
							case "4":

								// Checks if Ticket booth has 0 cards
								if (booth4.opusCount() == 0) {
									System.out.println("Sorry, that Ticketbooth has no cards.");
									break;
								} else {
									// Asks which card the user wants to remove based on array index
									System.out.println(
											"Enter card number you wish to remove (Enter card number from 0 to "
													+ (booth4.opusCount() - 1) + ")");
									cardNb = keyboard.next();

									// Removes designated card and exits loop
									booth4.removeOpus(cardNb);
									System.out.println("Card was removed successfully");
									loop3 = false;
									break;
								}

								// Option 7.5: Removes OPUS card to booth 5
							case "5":

								// Checks if Ticket booth has 0 cards
								if (booth5.opusCount() == 0) {
									System.out.println("Sorry, that Ticketbooth has no cards.");
									break;
								} else {
									// Asks which card the user wants to remove based on array index
									System.out.println(
											"Enter card number you wish to remove (Enter card number from 0 to "
													+ (booth5.opusCount() - 1) + ")");
									cardNb = keyboard.next();

									// Removes designated card and exits loop
									booth5.removeOpus(cardNb);
									System.out.println("Card was removed successfully");
									loop3 = false;
									break;
								}

								// Default option in order to validate user input
							default:
								System.out.println("Sorry, this booth does not exist. Try again.");
								break;
						}
					}
					break;

				// Option 8: Asks user which card from which ticket booth he wants to update
				case "8":
					// Inner loop to validate user input
					boolean loop4 = true;
					while (loop4) {

						// Switch case to determine which ticket booth they want to update a card from
						String boothNb;

						System.out.println(
								"Which Ticketbooth do you want to update an OPUS card from? (Enter number 1 to 5):");
						boothNb = keyboard.next();
						switch (boothNb) {

							// Option 8.1: Updates a card from booth 1
							case "1":
								// Checks if booth1 has no cards
								if (booth1.opusCount() == 0) {
									System.out.println("Sorry, that Ticketbooth has no cards.");
									break;
								} else {

									// Inner loop to validate user input
									while (true) {

										// Asks for which card user wants to update
										String cardNb;
										int newMonth, newYear;
										System.out.println("Which card do you want to update? (Enter card number 0 to "
												+ (booth1.opusCount() - 1) + ")");
										cardNb = keyboard.next();

										// If statement for input validation
										if (Integer.parseInt(cardNb) < 0
												|| Integer.parseInt(cardNb) > booth1.opusCount() - 1) {
											System.out.println("Sorry, that is not a valid card, please try again.");
										} else {
											System.out
													.println("Enter new expiry month and year (seperate by a space): ");
											newMonth = keyboard.nextInt();
											newYear = keyboard.nextInt();
											booth1.updateExpiration(Integer.parseInt(cardNb), newMonth, newYear);
											loop4 = false;
											break;
										}
									}
									break;
								}

								// Option 8.2:
							case "2":
								// Checks if booth2 has no cards
								if (booth2.opusCount() == 0) {
									System.out.println("Sorry, that Ticketbooth has no cards.");
									break;
								} else {

									// Inner loop to validate user input
									while (true) {

										// Asks for which card user wants to update
										String cardNb;
										int newMonth, newYear;
										System.out.println("Which card do you want to update? (Enter card number 0 to "
												+ (booth2.opusCount() - 1) + ")");
										cardNb = keyboard.next();

										// If statement for input validation
										if (Integer.parseInt(cardNb) < 0
												|| Integer.parseInt(cardNb) > booth2.opusCount() - 1) {
											System.out.println("Sorry, that is not a valid card, please try again.");
										} else {
											System.out
													.println("Enter new expiry month and year (seperate by a space): ");
											newMonth = keyboard.nextInt();
											newYear = keyboard.nextInt();
											booth2.updateExpiration(Integer.parseInt(cardNb), newMonth, newYear);
											loop4 = false;
											break;
										}
									}
									break;
								}

								// Option 8.3:
							case "3":
								// Checks if booth3 has no cards
								if (booth3.opusCount() == 0) {
									System.out.println("Sorry, that Ticketbooth has no cards.");
									break;
								} else {

									// Inner loop to validate user input
									while (true) {

										// Asks for which card user wants to update
										String cardNb;
										int newMonth, newYear;
										System.out.println("Which card do you want to update? (Enter card number 0 to "
												+ (booth3.opusCount() - 1) + ")");
										cardNb = keyboard.next();

										// If statement for input validation
										if (Integer.parseInt(cardNb) < 0
												|| Integer.parseInt(cardNb) > booth3.opusCount() - 1) {
											System.out.println("Sorry, that is not a valid card, please try again.");
										} else {
											System.out
													.println("Enter new expiry month and year (seperate by a space): ");
											newMonth = keyboard.nextInt();
											newYear = keyboard.nextInt();
											booth3.updateExpiration(Integer.parseInt(cardNb), newMonth, newYear);
											loop4 = false;
											break;
										}
									}
									break;
								}

								// Option 8.4:
							case "4":
								// Checks if booth4 has no cards
								if (booth4.opusCount() == 0) {
									System.out.println("Sorry, that Ticketbooth has no cards.");
									break;
								} else {

									// Inner loop to validate user input
									while (true) {

										// Asks for which card user wants to update
										String cardNb;
										int newMonth, newYear;
										System.out.println("Which card do you want to update? (Enter card number 0 to "
												+ (booth4.opusCount() - 1) + ")");
										cardNb = keyboard.next();

										// If statement for input validation
										if (Integer.parseInt(cardNb) < 0
												|| Integer.parseInt(cardNb) > booth4.opusCount() - 1) {
											System.out.println("Sorry, that is not a valid card, please try again.");
										} else {
											System.out
													.println("Enter new expiry month and year (seperate by a space): ");
											newMonth = keyboard.nextInt();
											newYear = keyboard.nextInt();
											booth4.updateExpiration(Integer.parseInt(cardNb), newMonth, newYear);
											loop4 = false;
											break;
										}
									}
									break;
								}

								// Option 8.5:
							case "5":
								// Checks if booth5 has no cards
								if (booth5.opusCount() == 0) {
									System.out.println("Sorry, that Ticketbooth has no cards.");
									break;
								} else {

									// Inner loop to validate user input
									while (true) {

										// Asks for which card user wants to update
										String cardNb;
										int newMonth, newYear;
										System.out.println("Which card do you want to update? (Enter card number 0 to "
												+ (booth5.opusCount() - 1) + ")");
										cardNb = keyboard.next();

										// If statement for input validation
										if (Integer.parseInt(cardNb) < 0
												|| Integer.parseInt(cardNb) > booth5.opusCount() - 1) {
											System.out.println("Sorry, that is not a valid card, please try again.");
										} else {
											System.out
													.println("Enter new expiry month and year (seperate by a space): ");
											newMonth = keyboard.nextInt();
											newYear = keyboard.nextInt();
											booth5.updateExpiration(Integer.parseInt(cardNb), newMonth, newYear);
											loop4 = false;
											break;
										}
									}
									break;
								}

								// Default option in order to validate user input
							default:
								System.out.println("Sorry, this booth does not exist. Try again.");
								break;
						}
					}
					break;

				// Option 9: Asks user which ticket booth's tickets they want to add, and the
				// number of each tickets they want to add.
				// then adds these quantities to the ticket booth.
				case "9":
					// Inner loop to validate user input
					boolean loop5 = true;
					while (loop5) {

						// Switch case to determine which ticket booth user wants to add tickets to
						String boothNb;
						int addRegular, addJunior, addSenior, addDaily, addWeekly;
						System.out.println("Which Ticketbooth do you want to add Tickets to? (Enter number 1 to 5):");
						boothNb = keyboard.next();
						switch (boothNb) {

							// Adds tickets to booth1
							case "1":
								System.out.println(
										"How many regular, junior, senior, daily and weekly do you want to add?");
								System.out.println("Enter 5 numbers seperated by a space: ");
								addRegular = keyboard.nextInt();
								addJunior = keyboard.nextInt();
								addSenior = keyboard.nextInt();
								addDaily = keyboard.nextInt();
								addWeekly = keyboard.nextInt();
								System.out.println("You now have "
										+ booth1.addTickets(addRegular, addJunior, addSenior, addDaily, addWeekly));
								loop5 = false;
								break;

							// Adds tickets to booth2
							case "2":
								System.out.println(
										"How many regular, junior, senior, daily and weekly do you want to add?");
								System.out.println("Enter 5 numbers seperated by a space: ");
								addRegular = keyboard.nextInt();
								addJunior = keyboard.nextInt();
								addSenior = keyboard.nextInt();
								addDaily = keyboard.nextInt();
								addWeekly = keyboard.nextInt();
								System.out.println("You now have "
										+ booth2.addTickets(addRegular, addJunior, addSenior, addDaily, addWeekly));
								loop5 = false;
								break;

							// Adds tickets to booth3
							case "3":
								System.out.println(
										"How many regular, junior, senior, daily and weekly do you want to add?");
								System.out.println("Enter 5 numbers seperated by a space: ");
								addRegular = keyboard.nextInt();
								addJunior = keyboard.nextInt();
								addSenior = keyboard.nextInt();
								addDaily = keyboard.nextInt();
								addWeekly = keyboard.nextInt();
								System.out.println("You now have "
										+ booth3.addTickets(addRegular, addJunior, addSenior, addDaily, addWeekly));
								loop5 = false;
								break;

							// Adds tickets to booth4
							case "4":
								System.out.println(
										"How many regular, junior, senior, daily and weekly do you want to add?");
								System.out.println("Enter 5 numbers seperated by a space: ");
								addRegular = keyboard.nextInt();
								addJunior = keyboard.nextInt();
								addSenior = keyboard.nextInt();
								addDaily = keyboard.nextInt();
								addWeekly = keyboard.nextInt();
								System.out.println("You now have "
										+ booth4.addTickets(addRegular, addJunior, addSenior, addDaily, addWeekly));
								loop5 = false;
								break;

							// Adds tickets to booth5
							case "5":
								System.out.println(
										"How many regular, junior, senior, daily and weekly do you want to add?");
								System.out.println("Enter 5 numbers seperated by a space: ");
								addRegular = keyboard.nextInt();
								addJunior = keyboard.nextInt();
								addSenior = keyboard.nextInt();
								addDaily = keyboard.nextInt();
								addWeekly = keyboard.nextInt();
								System.out.println("You now have "
										+ booth5.addTickets(addRegular, addJunior, addSenior, addDaily, addWeekly));
								loop5 = false;
								break;

							// Default case for input validation
							default:
								System.out.println("Sorry, this booth does not exist. Try again.");
								break;
						}
					}
					break;

				// Option 0: Terminates program and displays closing message
				case "0":
					System.out.println("Thank you for using Concordia Fall Geek's Ticketbooth application");
					keyboard.close();
					System.exit(0);
					break;

				// Default case in order to validate user input
				default:
					System.out.println("That is a wrong input. Please try again!");
					break;
			}
		}

	}

}
