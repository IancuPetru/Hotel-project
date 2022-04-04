//default package;
import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;


//import org.junit.Test;
//import org.junit.runner.RunWith;
//@RunWith(JUnitPlatform.class)
public class Junit1 {

	@Test
	public void test() {
		Amenities H1= new foodbar(new Spa(new foodbar(new HotelRoom())));
		  double output=H1.cost();
		  assertEquals(90,output);
	}

}
