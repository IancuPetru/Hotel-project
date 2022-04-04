
public class Test {
	  public static void main(String[] args)
	    {
	  

	            Details details=new Details(); 
	            IDetails rm=details.getDetails("foodbar");
	            rm.show();
	            System.out.println("--------------------------------------------------");
	            IDetails rm1=details.getDetails("Spa");
	            rm1.show();
	            System.out.println("--------------------------------------------------");
	            IDetails rm2=details.getDetails("HotelRoom");
	            rm2.show();
	            
	            System.out.println("--------------------------------------------------");
	         
	          // ParkingPlace a =  ParkingPlace.getInstance();
	           ParkingPlace rent=  ParkingPlace.getInstance();
	           ParkingPlace rent1 =  ParkingPlace.getInstance();
	          
	         if(rent==rent1)
	          {
	              System.out.println("Objects are the same instance");
	              
	          }
	          if (rent!=rent1)
	          {  System.out.println("Objects are not the same instance");}
	          
	          System.out.println("--------------------------------------------------");
	          
	        Amenities H1=new foodbar(new Spa(new foodbar(new HotelRoom())));
	        System.out.println("description:"+H1.getDescription()) ;
	        System.out.println("cost:"+H1.cost()) ;
	        System.out.println("--------------------------------------------------");
	        Amenities H2=new foodbar(new HotelRoom());
	        System.out.println("description:"+H2.getDescription()) ;
	        System.out.println("cost:"+H2.cost()) ;
	        System.out.println("--------------------------------------------------");
	        Amenities H3=new Spa(new HotelRoom());
	        System.out.println("description:"+H3.getDescription()) ;
	        System.out.println("cost:"+H3.cost()) ;
	    }

}
