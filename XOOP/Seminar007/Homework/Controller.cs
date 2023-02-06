

class Controller {
    public static Dictionary<int, PhoneUser> Users = new Dictionary<int, PhoneUser>();

    public static void run() {

        Model.viewPhoneUsers();
        View.writeFormat();

    }
}
