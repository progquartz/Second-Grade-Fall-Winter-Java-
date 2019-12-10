public abstract class Employee implements Payable
{
    private String firstName;
    private String lastName;
    private String SSN;

    public Employee( String first, String last, String ssn )
    {
        firstName = first;
        lastName = last;
        SSN = ssn;
    }


    public void setFirstName( String first )
    {
        firstName = first;
    }

    // return first name
    public String getFirstName()
    {
        return firstName;
    }

    // set last name
    public void setLastName( String last )
    {
        lastName = last;
    }

    // return last name
    public String getLastName()
    {
        return lastName;
    }

    // set social security number
    public void setSocialSecurityNumber( String ssn )
    {
        SSN = ssn; // should validate
    }

    // return social security number
    public String getSocialSecurityNumber()
    {
        return SSN;
    }

    // return String representation of Employee object
    public String toString()
    {
        return "First Name : " + firstName + ", Last name : " + lastName + ", SSnb : " + SSN;
    }


    public abstract double earnings(); // abstraction이기 때문에, 그냥 있다는 존재만 보여준다.
}