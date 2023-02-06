public class UserBuilder : PhoneUser {
    PhoneUser instance = new PhoneUser();
    static UserBuilder userBuilder = new UserBuilder();

    public static UserBuilder getInstance() {
        if (userBuilder == null)
            userBuilder = new UserBuilder();

        userBuilder.instance = new PhoneUser();
        return userBuilder;
    }

    public PhoneUser GetInstance()
    {
        return instance;
    }

    public PhoneUser creatUser() {
        return instance;
    }

    public UserBuilder setFirstName(String firstName) {
        instance.setUserFirstName(firstName);
        return this;
    }

    public UserBuilder setLastName(String lastName) {
        instance.setUserLastName(lastName);
        return this;
    }

    public UserBuilder setPatronymic(String patronymic) {
        instance.setUserPatronymic(patronymic);
        return this;
    }

    public UserBuilder setPhoneNumber(int phoneNumber) {
        instance.setUserPhoneNumber(phoneNumber);
        return this;
    }

    public UserBuilder setDayOfBirth(int dayOfBirth) {
        instance.setUserDayOfBirth(dayOfBirth);
        return this;
    }

    public UserBuilder setMonthOfBirth(int monthOfBirth) {
        instance.setUserMonthOfBirth(monthOfBirth);
        return this;
    }

    public UserBuilder setYearOfBirth(int yearOfBirth) {
        instance.setUserYearOfBirth(yearOfBirth);
        return this;
    }
}
