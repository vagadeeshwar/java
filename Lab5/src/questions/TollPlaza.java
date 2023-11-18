package questions;

public class TollPlaza {
	String vehicleType;

	public TollPlaza(String type) {
		vehicleType = type;
	}

	public double tollRate() {
		if (vehicleType == "Car") {
			return 50;
		} else if (vehicleType == "Van") {
			return 75;
		} else if (vehicleType == "Bus" || vehicleType == "Lorry") {
			return 100;
		} else {
			return -1;
		}
	}

	public double tollRate(boolean t) {
		if (t) {
			return 0;
		} else {
			return tollRate();
		}
	}
}
