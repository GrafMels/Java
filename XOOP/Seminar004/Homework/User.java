class User {
    String name;
    boolean admin;

    public User(String name) {
        this.name = name;
    }

    void printMessage(String msg, String chatRoomName) {
        System.out.printf("[%s] %s: %s\n", chatRoomName, name, msg);
    }

    void sendMsg(String text, Chatroom chatroom) {
        chatroom.sendMessage(text, this);
    }
}
