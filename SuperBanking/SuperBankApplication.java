
public class SuperBankApplication {
	
	public static void main (String[] args) {
		
		Bank transaction = new Bank();
		transaction.addClient(0,"Waylon Dalton","351 Surrey Circle Brooklyn NY 11209");
		transaction.addAccount(0);
		transaction.debit(0,1356);
		
		transaction.addClient(1,"Justine Henders","9858 Glen Eagles Ave. NY 11237");
		transaction.addAccount(1);
		transaction.debit(1,156);
		
		transaction.addClient(2,"Abdullah Lang","9927 Woodside Lane NY 11213");
		transaction.addAccount(2);
		transaction.debit(2,1156);
		
		transaction.addClient(3,"Marcus Cruzing","71 Depot Lane Brooklyn NY 11212");
		transaction.addAccount(3);
		transaction.debit(3,0);
		
		transaction.addClient(4,"Thalia Cobbing","7233 NE. Summer St. NY 11235");
		transaction.addAccount(4);
		transaction.debit(4,2016);
		
		transaction.addClient(5,"Mathias Little" , "87 Deerfield Ave. S. Valley NY 10977");
		transaction.addAccount(5);
		transaction.debit(5,3599);
		
		transaction.addClient(6,"Eddie Randolph" ,"718 East Howard Rd. NY 10977");
		transaction.addAccount(6);
		transaction.debit(6,7146);
		
		transaction.addClient(7,"Angela Walker" ,"9768 Fieldstone Rd. Bronx, NY 10456");
		transaction.addAccount(7);
		transaction.debit(7,156);
		
		transaction.addClient(8,"Lia Shelton","226 High Noon Ave. Bronx, NY 10463");
		transaction.addAccount(8);
		transaction.debit(8,31356);
		
		transaction.addClient(9,"Hadassah Hartman","642 Windfall Drive New York NY 11370");
		transaction.addAccount(9);
		transaction.debit(9,21256);
		
		transaction.addClient(10,"Joanna Shaffer","99 Heritage St. New York, NY 10040");
		transaction.addAccount(10);
		transaction.debit(10,16);
		
		transaction.addClient(11,"Jonathon Sheppard","7 Cactus Ave. New York, NY 12550");
		transaction.addAccount(11);
		transaction.debit(11,56);
		
		transaction.printAllCustomers(11);
		
		System.out.print("\n\n");
		
		transaction.removeAccount(8);
		transaction.removeClient(8);
		
		transaction.printAllCustomers(11);		
		
	}

}
