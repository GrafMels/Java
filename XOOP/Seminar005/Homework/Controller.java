import java.util.HashMap;
import java.util.Map;

import User.PhoneUser;

class Controller {
    public static Map<Integer, PhoneUser> Users = new HashMap<Integer, PhoneUser>();

    public static void run() {

        Model.viewPhoneUsers();
        View.writeTXT();

    }
}
