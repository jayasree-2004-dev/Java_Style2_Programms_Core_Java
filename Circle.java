class Circle
{
//Encapsulated the values to match with the requiremens.To avoid invalid values.
private static double pi=3.14;
private double radius;

public void giveRadius(double r)
{
if(r>=7 && r<=25)
{
radius=r;
}
else
{
System.err.println("Given Radius is not valid");
System.out.println("Radius should be between 7 to 25");
}
}



public void findArea()
{
double area=pi*radius*radius;
System.out.println("Area of the circle is="+area);
}

public void findCircumference()
{
double circumference=2*pi*radius;
System.out.println("Circumference of the circle is="+circumference);
}

public void circleInformation()
{
System.out.println("PI="+pi);
System.out.println("Radius="+radius);
findArea();
findCircumference();
}

}

