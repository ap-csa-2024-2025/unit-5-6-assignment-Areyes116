public class Dog
{
  private String breed;
  private double weight;
  private String name;
  private String color;
  private String gender;

  public Dog()
  {
    breed = "pug";
    name = "Lucy";
    color = "tan";
    weight = 30;
    gender = "female";
  }

  public Dog(String iName, String iBreed, String iClolor, double Weight)
  {
    name = iName;
    breed = iBreed;
    color = iColor;
    weight = iWeight;
  }

  // Make setters
  public void setBreed(String iBreed)
  {
    breed = iBreed;
  }

  // Set gender
  public void setGender(String iGender)
  {
    gender = iGender
  }

  // Make setters
  public void setName(String iName)
  {
    name = iName;
  }

  // Set Weight
  public void setWeight (doeuble iWeight)
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

  // Make getters
  public String getBreed()
  {
    return breed;
  }
}
