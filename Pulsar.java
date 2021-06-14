package SOLID;

public class Pulsar extends Bike {
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
    public void limitSpeed() {
		// TODO Auto-generated method stub
		System.out.println("100 KMPH");
	}
    public void Type() {
    	System.out.println("Sports model Bike");
    }
}
