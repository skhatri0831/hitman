package carbonFootPrint;

public class cycle extends carbonProducer implements carbonFootPrint {

	float mileage;
	int carbonNumber;
	
	public void setMileage(float mileage){ // sets the cycle mileage
		this.mileage=mileage;
		
	}
	
	@Override
	public int getCarbonFootPrint() { // returns value of cycle rider and carbon influence
		carbonNumber=(int) (mileage*2);
		return carbonNumber;
	}

	@Override
	public void tellresult() { // the cycle identifier
		System.out.println("\n\nThis is cycle ");

		
	}

}
