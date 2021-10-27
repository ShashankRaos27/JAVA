package helmetstarter;

import helmet.Vehicle;

public class VehicleStarter {

	public static void main(String[] args) {
		
		Vehicle vehicle=new Vehicle();
		vehicle.add(2021);
		vehicle.add(1990);
		vehicle.add(2020);
		vehicle.add(2015);
		vehicle.add(1998);
		vehicle.add(0);

		vehicle.displayModel();
		
	}
}
