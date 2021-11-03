package it.unibo.oop.lab.exception2;

public class WrongAccountHolderException extends RuntimeException{
	
	public WrongAccountHolderException(){
		super();
	}
	
	@Override
    public String toString() {
        return "Wrong Account Holder";
    }

    @Override
    public String getMessage() {
        return this.toString();
    }
}
