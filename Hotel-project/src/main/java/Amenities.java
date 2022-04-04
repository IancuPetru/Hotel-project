
public abstract class Amenities  implements IDetails{
	   protected  IDetails tempdetails;
	   public Amenities() {
		super();
		
	}
	public Amenities(IDetails newIDetails) {
		
	tempdetails=newIDetails;
	  
		}
	    public  double cost() {
	    	return tempdetails.cost(); }
	    
		public  String getDescription() {
			return tempdetails.getDescription();
		}
	 

}
