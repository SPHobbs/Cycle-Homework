
public class cycle {
	private static int numberOfWheels;
	private static int weight;
	public cycle(int wheels, int bikeWeight) {
	    numberOfWheels = wheels;
	    weight = bikeWeight;
	}
	public String toString(){
		return "Number of wheels: " + numberOfWheels +".\n Weight of bike: " + weight;
	}
}
