public class Model {
    public static bool[] open = new bool[4];

    public static void viewPhoneUsers() {
        View.readFirstAsync();
        string[] SplitName = new string[3];
        string[] birth = new string[3];
        for (int i = 0; i < 200; i++) {
            System.Console.Write("");
            SplitName = View.fullName[i].Split(" ");
            birth = View.birth[i].Split(" ");
            PhoneUser User = UserBuilder.getInstance()
                    .setLastName(SplitName[0])
                    .setFirstName(SplitName[1])
                    .setPatronymic(SplitName[2])
                    .setPhoneNumber(Int32.Parse(View.phoneNumber[i]))
                    .setDayOfBirth(Int32.Parse(birth[0]))
                    .setMonthOfBirth(Int32.Parse(birth[1]))
                    .setYearOfBirth(Int32.Parse(birth[2]))
                    .creatUser();
            Controller.Users.Add(i, User);
        }
    }
}
