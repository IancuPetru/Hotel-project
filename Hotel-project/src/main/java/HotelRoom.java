
public class HotelRoom implements IDetails{
	// @Override
		public void show() {
			
	    	 System.out.println("All our guestrooms are elegantly furnished\n with handmade furniture include luxury en-suite facilities with complimentary amenities pack, \nflat screen LCD TV, tea/coffee making facilities,\n fan, hairdryer and the finest pure white linen and towels.");
			
		}

		public String getDescription()
	    {
	        return "A Hotel Room";
	    }

		public double cost()
	    {
	        return cost;
	    }

	    private static double cost = 50.00;
	   

}
