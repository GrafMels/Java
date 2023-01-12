import java.util.ArrayList;

interface Chatroom {
    void sendMessage(String msg, User user);

    void appendClient(User user);
}

class Chat implements Chatroom {

    String chatRoomName;
    ArrayList<User> users = new ArrayList<>();
    ArrayList<User> admin = new ArrayList<>();
    private ArrayList<String> history = new ArrayList<>();

    public Chat(String chatRoomName) {
        this.chatRoomName = chatRoomName;

    }

    @Override
    public void sendMessage(String text, User me) {
        if (users.contains(me)) {
            history.add(String.format("%s: %s", me.name, text));
            for (User user : users) {
                if (user.name != me.name) {
                    user.printMessage(text, chatRoomName);
                }
            }
        } else {
            System.out.println("Eror: Тебя нет в этом чате");
        }

    }

    @Override
    public void appendClient(User client) {
        System.out.printf("\n >>> поключается к беседе [%s]: %s\n", chatRoomName, client.name);
        users.add(client);

    }

    void getAdmin(User client) {
        System.out.printf("\n >>>%s теперь администратор в беседе [%s]\n", client.name, chatRoomName);
        admin.add(client);
    }

    public void deleteWithouChat(User administrator, User remote) {

        for (User user : admin) {
            if (user.name.equals(administrator.name)) {
                for (int i = 0; i < users.size(); i++) {
                    if (users.get(i).equals(remote.name)) {
                        System.out.printf("\n >>>%s удалён из беседы [%s]\n", users, chatRoomName);
                        users.remove(i);

                    }
                }
            }
        }
    }

    public void getAllChatUsers(User administrator) {
        System.out.println();
        boolean i = true;
        for (User user : admin) {
            if (user.name.equals(administrator.name)) {
                for (User useres : users) {
                    System.out.println(useres.name);
                    i = false;
                }
            }
        }
        if (i == true) {
            System.out.println("Eror: Ты не админ");
        }
    }

    public void getChatHistory(User administrator) {
        System.out.println();
        boolean i = true;
        for (User user : admin) {
            if (user.name.equals(administrator.name)) {
                for (String historyStap : history) {
                    System.out.println(historyStap);
                    i = false;
                }
            }
        }
        if (i == true) {
            System.out.println("Eror: Ты не админ");
        }

    }

}