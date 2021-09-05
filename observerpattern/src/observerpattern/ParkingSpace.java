package observerpattern;
import java.util.ArrayList;
import java.util.List;

public class ParkingSpace implements DigitalParkingBoard {

	private List<Vehicle> Vehicles;
	private boolean available = false;
	
	public ParkingSpace(){
		Vehicles = new ArrayList<Vehicle>();
	}
	
	public void vehicleEnter(Vehicle ins){
		Vehicles.add(ins);
	}
	
	public void vehicleExit(Vehicle ins){
		Vehicles.remove(ins);
	}
	
	public void notification(){
		for(Vehicle obs:Vehicles){
			obs.update(available);
		}
	}

	public void available(boolean available){
		this.available = available;
		notification();
	}
}
