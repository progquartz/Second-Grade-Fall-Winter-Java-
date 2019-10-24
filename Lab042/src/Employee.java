public abstract class Employee
{
    private String firstName;
    private String lastName;
    private String socialSecurityNumber;

    public Employee( String first, String last, String ssn )
    {
        firstName = first;
        lastName = last;
        socialSecurityNumber = ssn;
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
        socialSecurityNumber = ssn; // should validate
    }

    // return social security number
    public String getSocialSecurityNumber()
    {
        return socialSecurityNumber;
    }

    // return String representation of Employee object
    public String toString()
    {
        return "First Name : " + firstName + ", Last name : " + lastName + ", SSnb : " + socialSecurityNumber;
    }


    public abstract double earnings(); // abstraction이기 때문에, 그냥 있다는 존재만 보여준다.
}