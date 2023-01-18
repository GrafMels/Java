package User;

public class PhoneUser {
    protected String firstName;
    protected String lastName;
    protected String patronymic;
    protected int phoneNumber;
    protected int dayOfBirth;
    protected int monthOfBirth;
    protected int yearOfBirth;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public String getFullName() {
        return String.format("%s %s %s", lastName, firstName, patronymic);
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public int getDayOfBirth() {
        return dayOfBirth;
    }

    public int getMonthOfBirth() {
        return monthOfBirth;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public String getFullInformation() {
        return String.format("%s: %s %s %s: %s/%s/%s", phoneNumber, lastName, firstName, patronymic, dayOfBirth,
                monthOfBirth,
                yearOfBirth);
    }

    public void setUserFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setUserLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setUserPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public void setUserPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setUserDayOfBirth(int dayOfBirth) {
        this.dayOfBirth = dayOfBirth;
    }

    public void setUserMonthOfBirth(int monthOfBirth) {
        this.monthOfBirth = monthOfBirth;
    }

    public void setUserYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

}
