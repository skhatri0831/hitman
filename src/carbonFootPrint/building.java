package carbonFootPrint;

public class building extends carbonProducer implements carbonFootPrint { // subclass that extends from parent class and implements carbonfootprint
	
		float water, gas, electricity;
		int housemembers;
		boolean meat;
		
		
	public void setfamily(int housemember) // sets the family number
	{
			this.housemembers=housemember;
		}
	public void setMeat(boolean meat){// sets the meat boolean
		
		this.meat=meat;
	}
	public void setWater(float water){// sets the water consumption
		this.water=water;
	}
	
	public void setgas(float gas){// sets the gas consumption
		this.gas=gas;
	}
	public void setelectricity(float electricity){ // sets the electricity consumption
		this.electricity=electricity;
	}
	
	int carbonPrint=0; // counter variable to count the carbon print value
	
	public void houseMemberPrint(){ // if member is 1 sets carbon print 14,2 then 12, 3 then 10 if greater than 3 sets carbon print value to 5 
		if(housemembers==1){
			carbonPrint=carbonPrint+14;
		}
		else if (housemembers==2){
			carbonPrint=carbonPrint+12;
			
		}
		else if (housemembers==3){
			carbonPrint=carbonPrint+10;
			
		}
		
		else if (housemembers>3){
			carbonPrint=carbonPrint + 5;
			
		}
	}
	
	public void meat(){ // if the family eats meat increases the carbon print value to 10;
		if(meat=true){
			carbonPrint=10;
		}
	}
	 
	
	
	@Override
	public int getCarbonFootPrint() {// returns the carbon print value 
		houseMemberPrint();
		meat();
		int electricUse= (int) (electricity*1.85);
		int waterUse= (int) (water*13);
		int gasUse = (int) (gas*13.466);
		carbonPrint=carbonPrint+electricUse+waterUse+gasUse;
	 return carbonPrint;
		
	}
		public void tellresult() // the building identifier
		{
			System.out.println("\n\nThis is building ");
		}
	}
	

