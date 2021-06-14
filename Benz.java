package SOLID;

public class Benz extends Car implements IVehicleRadio, IGPS{
	public void Start()
    {
        System.out.println("Car started!");
    }
    @Override
    public void Horn() {
    	System.out.println("Car HORN");
    }
    public void Stop()
    {
    	System.out.println("Car stopped!");
    }
	@Override
	public void limitSpeed() {
		// TODO Auto-generated method stub
		System.out.println("120 KMPH");
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
	@Override
	public void openDoors() {
		// TODO Auto-generated method stub
		System.out.println("Doors opened");
	}
	@Override
	public void closeDoors() {
		// TODO Auto-generated method stub
		System.out.println("Doors closed");
	}
	@Override
	public void getCoordinates() {
		// TODO Auto-generated method stub
		System.out.println("Your Coordinates: 18.1124° N, 79.0193° E ");
	}

}
