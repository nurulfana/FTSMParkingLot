
public class Vehicle {
	private String vehicletype;
	private String vehiclemodel;
	private String plateno;
	private Vehicle vehicleinfo;
	
	public Vehicle(String vt,String vm,String p,Vehicle v) {
		vehicletype = vt;
		vehiclemodel = vm;
		plateno = p;
		vehicleinfo = v;
	}
	public String getVehicletype() {
		return vehicletype;
	}
	public String getVehiclemodel() {
		return vehiclemodel;
	}
	public String getPlateno() {
		return plateno;
	}
	public Vehicle getVehicleinfo() {
		return vehicleinfo;
	}
	public String setVehicletype() {
		return vehicletype;
	}
	public String setVehiclemodel() {
		return vehiclemodel;
	}
	public String setPlateno() {
		return plateno;
	}
	public Vehicle setVehicleinfo() {
		return vehicleinfo;
	}
}
class Car extends Vehicle{

	public Car(String vt, String vm, String p, Vehicle v) {
		super(vt, vm, p, v);
	}
}
class Motorcyle extends Vehicle{

	public Motorcyle(String vt, String vm, String p, Vehicle v) {
		super(vt, vm, p, v);
	}
}
class Bus extends Vehicle{

	public Bus(String vt, String vm, String p, Vehicle v) {
		super(vt, vm, p, v);
	}
}
class Lorry extends Vehicle{

	public Lorry(String vt, String vm, String p, Vehicle v) {
		super(vt, vm, p, v);
		
	}
}
	
