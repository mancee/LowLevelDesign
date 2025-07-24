package LibraryManagementSystem;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public  class Fine {
	private int amount;
	
	Fine(LocalDate expected, LocalDate actual) {
		this.amount = (int) ChronoUnit.DAYS.between(actual, expected)*20;
	}
	
	int getAmount() {
		return this.amount;
	}
}
