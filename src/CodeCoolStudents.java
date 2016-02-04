
public class CodeCoolStudents
{
    String firstName;
    String lastName;
    int id = 0;
    double[] results;
    static int count = 0;
    static int oldest = 0;
    int age;
    public CodeCoolStudents(String firstName, String lastName, int age)
	/*konstruktor: lathatosagi modosito + osztaly neve*/
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        if (age > oldest)
        {
            CodeCoolStudents.oldest = age;
        }
        count++;
        this.id += 1;
    }
    //	public CodeCoolStudents()
//	{
//		count += 1;
//	}
//
//	public CodeCoolStudents(String firstName, int id)
//	{
//		this.firstName = firstName;
//		this.id = id;
//		count = 3;
//	}
//
//	public CodeCoolStudents(int id, String firstName)
//	{
//		this.firstName = firstName;
//		this.id = id;
//		count = 4;
//	}
    public String printOut()
    {
        return firstName + lastName;
    }
}