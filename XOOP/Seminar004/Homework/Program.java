public class Program {

    public static void main(String[] args) {
        Chat mk = new Chat("Монтеки");

        User client1 = new User("Бенволио");
        User client2 = new User("Меркуцио");
        User client4 = new User("Ромео");

        mk.appendClient(client1);
        mk.appendClient(client2);
        client1.sendMsg("Ох уж эти Капулети", mk);
        client2.sendMsg("Да ты прав", mk);
        mk.appendClient(client4);
        client2.sendMsg("Да будет вам, нормальные они", mk);

        User client3 = new User("Синьора Монтеки");
        mk.appendClient(client3);
        mk.getAdmin(client3);

        client3.sendMsg("О чём ты Ромео?", mk);

        Chat kl = new Chat("work");

        User client5 = new User("Синьор Капулетти");
        kl.appendClient(client5);
        kl.getAdmin(client5);

        User client6 = new User("Тибальт");
        kl.appendClient(client6);

        client5.sendMsg("Что у вас случилось Тибальт", kl);

        System.out.println();

        client6.sendMsg("Опять с Монтеками дрался", kl);

        User client7 = new User("Джульета");
        kl.appendClient(client7);
        kl.appendClient(client4);

        client7.sendMsg("Здарствуйте папа и братец", kl);
        client4.sendMsg("Здрасте", kl);
        client5.sendMsg("А этот что тут делает? Иди прочь!", kl);

        kl.deleteWithouChat(client4, client5);

        client2.sendMsg("sss", kl);

        System.out.println();

        kl.getAllChatUsers(client5);

        System.out.println();

        mk.getAllChatUsers(client5);

        mk.getAllChatUsers(client3);
        mk.getChatHistory(client3);
        kl.getChatHistory(client5);

    }
}
