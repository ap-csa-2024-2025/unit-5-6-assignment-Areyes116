// Plane.java
public class Plane
{
    private int location; // Milestone 2: Declare the location variable

    // Milestone 1: Constructors
    public Plane()
    {
        this.location = 0; // Default constructor sets location to 0
    }

    public Plane(int loc)
    {
        if (loc >= -2000 && loc <= 2000)
        {
            this.location = loc;
        }
        else
        {
            this.location = 0; // If invalid location, set to 0
        }
    }

    // Milestone 3: Methods to move plane
    public void upward()
    {
        if (this.location < 2000)
        {
            this.location += 100;
        }
    }

    public void downward()
    {
        if (this.location > -2000)
        {
            this.location -= 100;
        }
    }

    // Milestone 2: Accessor for location
    public int getLocation()
    {
        return this.location;
    }

    // Milestone 4: String representation
    @Override
    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        int spaces = (this.location + 2000) / 100; // Calculate the number of spaces
        for (int i = 0; i < spaces; i++) 
            sb.append(" ");
    }
        sb.append("@");
        return sb.toString();
}

    // Main method for testing
    public static void main(String[] args)
    {
        Plane plane = new Plane();
        System.out.println(plane.toString());
        System.out.println("Location: " + plane.getLocation());

        plane.upward();
        System.out.println(plane.toString());
        System.out.println("Location: " + plane.getLocation());

        Plane newPlane = new Plane(-500);
        System.out.println(newPlane.toString());
        System.out.println("Location: " + newPlane.getLocation());

        newPlane.downward();
        System.out.println(newPlane.toString());
        System.out.println("Location: " + newPlane.getLocation());
    }
