package SOLID;

public class Main extends Vehicle {
public static void main(String args[]){
//	Vehicle obj=new Vehicle();
//	obj.init("Vehicle Class");
	Alto cobj=new Alto();
	cobj.init("Alto");
	cobj.openDoors();
	cobj.closeDoors();
	cobj.Start();
	cobj.startRadio();
	cobj.Horn();
	cobj.limitSpeed();
	cobj.changeChannel();
	cobj.stopRadio();
	cobj.Stop();
	System.out.println();
	Benz cobj1=new Benz();
	cobj1.init("Benz");
	cobj1.openDoors();
	cobj1.closeDoors();
	cobj1.Start();
	cobj1.startRadio();
	cobj1.Horn();
	cobj1.limitSpeed();
	cobj1.getCoordinates();
	cobj1.changeChannel();
	cobj1.stopRadio();
	cobj1.Stop();
	System.out.println();
	Chetak bobj=new Chetak();
	bobj.init("Chetak");
	bobj.Start();
	bobj.Horn();
	bobj.limitSpeed();
	bobj.Stop();
	System.out.println();
	Pulsar bobj1=new Pulsar();
	bobj1.init("Pulsar");
	bobj1.Type();
	bobj1.Start();
	bobj1.Horn();
	bobj1.limitSpeed();
	bobj1.Stop();
}

}