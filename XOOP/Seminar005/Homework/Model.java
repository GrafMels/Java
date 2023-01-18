import User.PhoneUser;
import User.UserBuilder;

public class Model {
    public static boolean[] open = new boolean[3];

    public static void viewPhoneUsers() {
        View.readFirst();
        String[] fullName = new String[3];
        String[] birth = new String[3];
        for (int i = 0; i < 200; i++) {
            fullName = View.fullName[i].split(" ");
            birth = View.birth[i].split(" ");
            PhoneUser User = UserBuilder.getInstance()
                    .setLastName(fullName[0])
                    .setFirstName(fullName[1])
                    .setPatronymic(fullName[2])
                    .setPhoneNumber(Integer.valueOf(View.phoneNumber[i]))
                    .setDayOfBirth(Integer.valueOf(birth[0]))
                    .setMonthOfBirth(Integer.valueOf(birth[1]))
                    .setYearOfBirth(Integer.valueOf(birth[2]))
                    .creatUser();
            Controller.Users.put(i, User);
        }
    }
}
