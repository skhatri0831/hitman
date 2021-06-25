package carbonFootPrint;

public class car extends carbonProducer implements carbonFootPrint {
	
	float fuel;
	public void setFuel(float fuel){// sets the fuel from the user
		this.fuel=fuel;
	}
	
	
	@Override
	public int getCarbonFootPrint() { // fossil fuel formula to find carbon print
		int totalEmission= (int) (fuel * 22);
		return totalEmission+12;// since owns the car +12;
	}

	@Override
	public void tellresult() {// the car identifier
		System.out.println("\n\nThis is Car ");
		
	}

}
