import java.util.ArrayList;

public class Program {

    public static void main(String[] args) {
        Chat gb = new Chat();

        User client1 = new User("Маша", gb, "gb");
        User client2 = new User("Вася", gb, "gb");
        User client4 = new User("Валентин", gb, "gb");

        gb.appendClient(client1, "gb");
        gb.appendClient(client2, "gb");
        gb.appendClient(client4, "gb");

        client2.sendMsg("Ку-Ку!", "gb");

        User client3 = new User("Агаповна", gb, "gb");
        gb.appendClient(client3, "gb");

        client3.sendMsg("hello world!", "gb");

        Chat work = new Chat();

        work.appendClient(client1, "work");
        work.appendClient(client3, "work");
        User client5 = new User("Петрович", work, "work");
        work.appendClient(client5, "work");

        client1.sendMsg("Всем, привет!", "gb");

        System.out.println("\n\n");

        client1.sendMsg("Вот это поворот", "work");

    }
}

class User {
    String name;
    private Chatroom chatroom;
    private String chatRoomName;

    public User(String name, Chatroom chatroom, String chatRoomName) {
        this.name = name;
        this.chatroom = chatroom;
        this.chatRoomName = chatRoomName;

    }

    void printMessage(String msg, String chatRoomName) {
        System.out.printf("[%s] %s: %s\n", chatRoomName, name, msg);
    }

    void sendMsg(String text, String chatRoomName) {
        chatroom.sendMessage(text, this, chatRoomName);
    }
}

interface Chatroom {
    void sendMessage(String msg, User user, String chatRoomName);

    void appendClient(User user, String chatRoomName);
}

class Chat implements Chatroom {

    ArrayList<User> users = new ArrayList<>();

    @Override
    public void sendMessage(String text, User me, String chatRoomName) {

        for (User user : users) {
            if (user.name != me.name) {
                user.printMessage(text, chatRoomName);
            }
        }
    }

    @Override
    public void appendClient(User client, String chatRoomName) {
        System.out.printf("\n >>> поключается к беседе [%s]: %s\n", chatRoomName, client.name);
        users.add(client);

    }
}
