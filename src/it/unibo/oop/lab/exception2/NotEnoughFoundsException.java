package it.unibo.oop.lab.exception2;

public class NotEnoughFoundsException extends IllegalStateException {
	
	private final double balance;
	private final double amount;
	
	public NotEnoughFoundsException(double balance, double amount) {
		super();
		this.balance = balance;
		this.amount = amount;
	}
	
	@Override
    public String toString() {
        return "Your Balance is:" + this.balance + ", you want to draw:" + this.amount + "-> ERROR";
    }

    public String getMessage() {
        return this.toString();
    }
}
