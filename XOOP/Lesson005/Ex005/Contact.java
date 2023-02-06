public class Contact {
    private String phoneNumber = "";
    private String birthDate = "";
    private String fullName = "";

    public void Contact() {

    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public String getFullName() {
        return fullName;
    }

    public void setContact(String phoneNumber, String birthDate, String fullName) {
        this.phoneNumber = phoneNumber;
        this.birthDate = birthDate;
        this.fullName = fullName;
    }
}
