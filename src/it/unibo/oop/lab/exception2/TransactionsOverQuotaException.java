package it.unibo.oop.lab.exception2;

public class TransactionsOverQuotaException extends IllegalStateException {
	
	private final int maximumAllowedATMTransactions;
	
	public TransactionsOverQuotaException(int maximumAllowedATMTransactions){
		this.maximumAllowedATMTransactions = maximumAllowedATMTransactions;
	}
	
	@Override
    public String toString() {
        return "You reach the max of transictions:" + this.maximumAllowedATMTransactions;
    }

    @Override
    public String getMessage() {
        return this.toString();
    }
}
