package SOLID;

abstract class Car extends Vehicle implements IVehicleHorn, IVehicleSpeedLimit, IVehicleDoors{
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
	public void openDoors() {
		// TODO Auto-generated method stub
		System.out.println("Doors opened");
	}
	@Override
	public void closeDoors() {
		// TODO Auto-generated method stub
		System.out.println("Doors closed");
	}
}
