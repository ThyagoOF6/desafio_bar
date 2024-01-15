package util;

public class Bill {
	
	public char gender;
	public int beer;
	public int barbecue;
	public int softDrink;
	
	
	public double feeding() {
		return this.beer * 5 + this.softDrink * 3 + this.barbecue * 7;
	}

	public double ticket() {
		if (this.gender == 'F') {
			return 8.00;
		}
		else {
			return 10.00;
		}
	}

	public double cover() {
		double fee = this.feeding();
		if	(fee > 30.00) {
			return 0.00;
		}
		else {
			return 4.00;
		}
	}
	
	public double total() {
		return this.feeding() + this.cover() + this.ticket();
	}
	
	public Bill() {
		super();
	}
	
}
