package beispiel;

public class LuckyTicket {

	public static void main(String[] args) {
		int ticketnumber = 203122;
		
		LuckyTicket lt = new LuckyTicket();
		
		if (lt.isLucky(ticketnumber)) {
			System.out.print(ticketnumber + " is a LUCKY ticket!!");
		}
		
	}

	//Überlegung = Wenn beide Seiten miteinander subtrahiert 0 ergeben sind sie gleich
	
	public boolean isLucky (int ticketnumber) {
		boolean luck = false;
		
		// Umwandlung in String um einzelne Zeichen zu ziehen
		String ticketString = Integer.toString(ticketnumber);
		
		int sum = 0;
		int midIndex = ticketString.length()/2;
		
		for (int i = 0; i < midIndex; i++) {
			// Konversion von char zu int wird impliziert
			sum += ticketString.charAt(i);
			sum -= ticketString.charAt(i+ midIndex);
		}
		
		if (sum == 0) {
			luck = true;
		}
		
		return luck;
	}
}
