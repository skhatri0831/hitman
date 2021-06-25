package carbonFootPrint;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class mainClass {
 
	
	public static void main(String args[]){
		// gets the required information from the user.
		Scanner s=new Scanner(System.in);
		System.out.print("How much fuel does the car consume in Gallon: ");
		float fuel= s.nextFloat(); 
		System.out.print("How much water do you consume in Gallon: ");
		float water= s.nextFloat(); 
		System.out.print("How much electricity do you consume in KW: ");
		float electricity= s.nextFloat(); 
		System.out.print("How many member in your family: ");
		int family= s.nextInt(); 
		System.out.print("How much gas do you consume in therm: ");
		float gas= s.nextFloat(); 
		System.out.print("Do you consume meat? True/False ");
		boolean meat= s.nextBoolean(); 
		System.out.print("How far do you ride the bike mileage?  ");
		float bikemileage= s.nextFloat(); 
		
		s.close();
		
		// initiate the building class
		building b=new building();
		// setting the corresponding values to the building class
		b.setWater(water);
		b.setelectricity(electricity);
		b.setfamily(family);
		b.setgas(gas);
		b.setMeat(meat);
		
		// initiate the car class
		car car = new car();
		// sets the fuel
		car.setFuel(fuel);
		
		// initiate the cycle class
		cycle cycle =new cycle();
		// sets the mileage
		cycle.setMileage(bikemileage);
		
		// create an array list
		List<carbonFootPrint> c= new ArrayList<carbonFootPrint>();
		
		c.add(b);// adding building to the arraylist
		c.add(car);// adding car to the arraylist
		c.add(cycle);// adding cycle to the arraylist
		
		for(int i=0;i<c.size();i++){ // for loop to iterate the array list 
			
			c.get(i).tellresult(); // gets the name of the class buliding/car/cycle
			
			System.out.println(c.get(i).getCarbonFootPrint());// gets the carbonprintvalue from each class
			
			if(c.get(i).getCarbonFootPrint()<3000){ // if < 3000 it is not a carbon producer
				
				((carbonProducer) c.get(i)).good();
				
			}
			else{									// if greater than 3000 it is a carbon producer.
				((carbonProducer) c.get(i)).bad();
			}
			
			
		}
	}
}
