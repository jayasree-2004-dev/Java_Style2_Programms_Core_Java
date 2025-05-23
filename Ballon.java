class Ballon
{
private static String gas="Helium";
private String color;
public void ballonType(String type)
{
if(type.equals("White") || type.equals("Blue") || type.equals("Gold") || type.equals("Silver"))

{
	color=type;
}
else
{
System.err.println("Ballon color is invalid");
System.err.println("Ballon color should be any of the color from White,Blue,Gold,Silver");
}
}

public void ballonInformation()
{
System.out.println("Ballon color is:"+color);
System.out.println("Ballon is filled with "+gas+" Gas");
}
}