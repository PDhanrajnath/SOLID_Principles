package SOLID;

abstract class Vehicle
{
    String model="";
    TypeVehicle vt=new TypeVehicle();
    void init(String model) {
    	this.model=model;
    	vt.start(model);
    }
}

