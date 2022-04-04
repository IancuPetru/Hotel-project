
public class ParkingPlace {
	 public static  ParkingPlace  rent;
	 
	 private  ParkingPlace() {
		  System.out.println("Parking place is reserved only for the owner,\n thank you for your understanding!");
	
	}

	public static ParkingPlace  getInstance() {
		
		if(rent==null) {
		rent=new ParkingPlace();}
		return rent;
		}

}
