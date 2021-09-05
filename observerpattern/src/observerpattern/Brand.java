package observerpattern;

public class Brand implements Vehicle {

	private ParkingSpace zoneA;
	private boolean isavailable;
	
	public Brand(ParkingSpace zoneA ){
		this.zoneA = zoneA;
		zoneA.vehicleEnter(this);
	}
	
	public void update(boolean available){
		this.isavailable=available;
		if(available ==true){
			display();
		}
		else{
		   	   System.out.println("ParkingSpace is not available. Plese park in other zone");
 	}
	}
	
	public void display(){
		System.out.println("You can park your vehicle in this zone");
	}


}
