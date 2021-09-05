package observerpattern;

public interface DigitalParkingBoard {
	public void vehicleEnter(Vehicle ins);
	public void vehicleExit(Vehicle ins);
	public void notification();
}
