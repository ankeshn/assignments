package Assignments;

class Transaction {
	public Transaction(Trader trader, int year, int value) {
		this.trader = trader;
		this.year = year;
		this.value = value;
	}
	Trader trader;
	int year;
	int value;
	
	public Trader getTrader() {
		return trader;
	}
	@Override
	public String toString() {
		return "Transactions [trader=" + trader + ", year=" + year + ", value="
				+ value + "]";
	}
	public void setTrader(Trader trader) {
		this.trader = trader;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
}

