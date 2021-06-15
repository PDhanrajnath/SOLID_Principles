package SOLID;

public class Alto extends Car implements  IVehicleRadio {
	
	@Override
	public void limitSpeed() {
		// TODO Auto-generated method stub
		System.out.println("90 KMPH");
	}
	@Override
	public void startRadio() {
		// TODO Auto-generated method stub
		System.out.println("Radio started...");		
	}
	@Override
	public void changeChannel() {
		// TODO Auto-generated method stub
		System.out.println("Listening to Radio...\n channel 1 2 3 4....");
	}
	@Override
	public void stopRadio() {
		// TODO Auto-generated method stub
		System.out.println("Radio stopped...");
	}
	

}
