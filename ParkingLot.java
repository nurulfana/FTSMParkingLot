
public class ParkingLot {
	private int vehicletotal;
	
	public ParkingLot(int vtl) {
		vehicletotal = vtl;
	}
	public int getVehicletotal() {
		return vehicletotal;
	}
	public int setVehicletotal() {
		return vehicletotal;
	}
}
class GeneralParkingLot extends ParkingLot{

	public GeneralParkingLot(int vtl) {
		super(vtl);
	}
}
class StaffParkingLot extends ParkingLot{
	
	public StaffParkingLot(int vtl) {
		super(vtl);
	}
}
class ManagementStaffParkingLot extends ParkingLot{
	
	public ManagementStaffParkingLot(int vtl) {
		super(vtl);
	}
}
