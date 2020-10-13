public class Sphere extends Shape3D
{
    private double radius;

    public Sphere(double radius)
    {
        this.radius=radius;
    }


    @Override
    public double getVolume()
    {
        return ( 4.0/3.0 )*3.14159*radius*radius*radius;
    }

    @Override
    public String getName() {
        return "sphere";
    }

    @Override
    public double getArea()
    {
        return 4.00*3.14159*radius*radius;
    }
}
