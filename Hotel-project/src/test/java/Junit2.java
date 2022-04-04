import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

//import org.junit.Test;
//import org.apache.log4j.Logger;
public class Junit2 {

	@Test
	public void test() {
		Amenities H2 = new foodbar(new HotelRoom());
		double output = H2.cost();
		assertEquals(60, output);
	}
//	public static Logger log = Logger.getLogger(JUnitTest.class.getName());
}
