public class Student
{
    private int ID;
    private int grade;
    private String name;

    // Default Constructor
    public Student()
    {
        this.ID = 0;
        this.grade = 0;
        this.name = "Unknown";
    }

    // Constructor with ID only
    public Student(int input_id)
    {
        this.ID = input_id;
        this.grade = 0;
        this.name = "Unknown";
    }

    // Constructor with ID and name
    public Student(int input_id, String input_name)
    {
        this.ID = input_id;
        this.name = input_name;
        this.grade = 0;
    }

    // Constructor with ID, grade, and name
    public Student(int input_id, int input_grade, String input_name)
    {
        this.ID = input_id;
        this.grade = input_grade;
        this.name = input_name;
    }

    // Accessor and Mutator for ID
    public int getID()
    {
        return this.ID;
    }

    public void setID(int ID)
    {
        this.ID = ID;
    }

    // Accessor and Mutator for grade
    public int getGrade()
    {
        return this.grade;
    }

    public void setGrade(int grade)
    {
        this.grade = grade;
    }

    // Accessor and Mutator for name
    public String getName()
    {
        return this.name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    // toString method
    public String toString()
    {
        return "ID: " + this.ID + "\nName: " + this.name + "\nGrade: " + this.grade;
    }
}


