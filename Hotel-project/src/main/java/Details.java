
public class Details {
	public IDetails getDetails(String Type)
{if (Type==null)
return null;
else if(Type.equals("foodbar"))
    return new foodbar();
else if(Type.equals("HotelRoom"))
	return new HotelRoom();
else if(Type.equalsIgnoreCase("Spa"))
	return new Spa();
return null;
}

}
