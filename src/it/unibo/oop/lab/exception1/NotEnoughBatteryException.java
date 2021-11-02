package it.unibo.oop.lab.exception1;

public class NotEnoughBatteryException extends IllegalStateException{
	
	private double batteryLevel;
	
	public NotEnoughBatteryException(double batteryLevel){
		super();
		this.batteryLevel = batteryLevel;
		
	}
	
	@Override
    public String toString() {
        return "Can not move bc not Enough Battery";
    }

    @Override
    public String getMessage() {
        return this.toString();
    }
}
