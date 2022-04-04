
public class Spa extends Amenities{
	public Spa(IDetails newIDetails) {
		super(newIDetails);
	
	}
  //  @Override
	public void show() {
		
    	 System.out.println("we have hot stone massage, body treatments, massages,\n pedicure and foot massage,"
 +" nail treatments");
	}

	public static final double cost = 20.00;
   
	@Override
    public double cost() {
        return tempdetails.cost() + cost;
    }

    @Override
    public String getDescription() {
        return tempdetails.getDescription() + " , with a Spa sesion";
    }

   public Spa() {
		super();
		}

}
