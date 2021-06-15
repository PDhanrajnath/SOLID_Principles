package SOLID;

abstract class Bike extends Vehicle implements IVehicleHorn, IVehicleSpeedLimit {
	public void Start()
    {
        System.out.println("Bike started!");
    }
    public void Horn() {
    	System.out.println("Bike Horn");
    }
    void Stop()
    {
    	System.out.println("Bike stopped!");
    }
}
