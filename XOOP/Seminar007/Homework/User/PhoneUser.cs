public class PhoneUser
{
    protected string firstName = "";
    protected string lastName = "";
    protected string patronymic = "";
    protected int phoneNumber;
    protected int dayOfBirth;
    protected int monthOfBirth;
    protected int yearOfBirth;

    public string getFirstName()
    {
        return firstName;
    }

    public string getLastName()
    {
        return lastName;
    }

    public string getPatronymic()
    {
        return patronymic;
    }

    public string getFullName()
    {
        return string.Format("{0} {1} {2}", lastName, firstName, patronymic);
    }

    public int getPhoneNumber()
    {
        return phoneNumber;
    }

    public int getDayOfBirth()
    {
        return dayOfBirth;
    }

    public int getMonthOfBirth()
    {
        return monthOfBirth;
    }

    public int getYearOfBirth()
    {
        return yearOfBirth;
    }

    public string getFullInformation()
    {
        return string.Format("{0}: {1} {2} {3}: {4}/{5}/{6}", phoneNumber, lastName, firstName, patronymic, dayOfBirth,
                monthOfBirth,
                yearOfBirth);
    }

    public void setUserFirstName(string firstName)
    {
        this.firstName = firstName;
    }

    public void setUserLastName(string lastName)
    {
        this.lastName = lastName;
    }

    public void setUserPatronymic(string patronymic)
    {
        this.patronymic = patronymic;
    }

    public void setUserPhoneNumber(int phoneNumber)
    {
        this.phoneNumber = phoneNumber;
    }

    public void setUserDayOfBirth(int dayOfBirth)
    {
        this.dayOfBirth = dayOfBirth;
    }

    public void setUserMonthOfBirth(int monthOfBirth)
    {
        this.monthOfBirth = monthOfBirth;
    }

    public void setUserYearOfBirth(int yearOfBirth)
    {
        this.yearOfBirth = yearOfBirth;
    }

}
