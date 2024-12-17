public class Dog
{
    private String breed;
    private double weight;
    private String name;
    private String color;
    private String gender;

    // Default Constructor
    public Dog()
    {
        breed = "pug";
        name = "Lucy";
        color = "tan";
        weight = 30;
        gender = "female";
    }

    // Parameterized Constructor
    public Dog(String iName, String iBreed, String iColor, double iWeight)
    {
        name = iName;
        breed = iBreed;
        color = iColor;
        weight = iWeight;
    }

    // Setters
    public void setBreed(String iBreed)
    {
        breed = iBreed;
    }

    public void setGender(String iGender)
    {
        gender = iGender;
    }

    public void setName(String iName)
    {
        name = iName;
    }

    public void setWeight(double iWeight)
    {
        if (iWeight < 0)
        {
            weight = 0;
        }
        else
        {
            weight = iWeight;
        }
    }

    public void setColor(String iColor)
    {
        color = iColor;
    }

    // Getters
    public String getBreed()
    {
        return breed;
    }

    public String getGender()
    {
        return gender;
    }

    public String getName()
    {
        return name;
    }

    public double getWeight()
    {
        return weight;
    }

    public String getColor()
    {
        return color;
    }
}