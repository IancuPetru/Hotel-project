
public class foodbar extends Amenities{
	public foodbar(IDetails newIDetails) {
		super(newIDetails);
	
	}

	public static final double cost = 10.00;

  // @Override
	public  void show() {
	  System.out.println("my best foodbar with various kinds of drinks and snacks");
	 }

   @Override
    public double cost() {
        return tempdetails.cost() + cost;
  }

	@Override
    public String getDescription() {
        return tempdetails.getDescription() + " , with a Food Bar";
    }

	public foodbar() {
	super();
	}
}
