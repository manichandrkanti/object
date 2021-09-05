package observerpattern;

public class SelfDriveCar {

	public static void main(String[] args) {
		ParkingSpace zoneA= new ParkingSpace();
		ParkingSpace zoneB= new ParkingSpace();
		ParkingSpace zoneC= new ParkingSpace();
		ParkingSpace zoneD= new ParkingSpace();
				
		Brand bmw = new Brand(zoneA);
		Brand ferrari = new Brand(zoneB);
		Brand suzuki = new Brand(zoneC);
		Brand huracan = new Brand(zoneD);
		
		zoneA.available(false);
		zoneB.available(false);
		zoneC.available(false);
		zoneD.available(true);
		

		}

	}


