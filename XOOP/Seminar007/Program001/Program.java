import javax.lang.model.type.NullType;
import javax.swing.ImageIcon;

/**
 * App
 */
public class Program {

    public static void main(String[] args) {
        Connection connection = new ConnectionImpl(new User("Sasa", "1234"));
        Db db1 = new Db();
        db1.setConnection(connection);
        System.out.println(db1);

        Db db2 = new Db();
        db2.setConnection(null);
        System.out.println(db2);

        Connection connection1 = new ConnectionImpl(new User("Igor", "12345"));
        Db db3 = new Db();
        db3.setConnection(connection1);
        System.out.println(db3);
        db3.setConnection(null);
        System.out.println(db3);
        db3.removeConnection();
        System.out.println(db3);
        Connection connection2 = new ConnectionImpl(new User("Teper Nina", "12345"));
        db3.setConnection(connection2);
        System.out.println(db3);
    }
}

class Db {
    Connection connection;

    public void setConnection(Connection connection) {
        if (this.connection == null && connection == null) {
            this.connection = new NullConnection();
        } else if (this.connection == null) {
            this.connection = connection;
        } else {
            System.out.println("Вы уже инициировали юзера");
        }

    }

    public void removeConnection() {
        this.connection = null;
    }

    @Override
    public String toString() {
        if (this.connection == null) {
            return "Пользователя не существует";
        } else {
            return connection.toString();
        }

    }
}

class ConnectionImpl implements Connection {
    User user;

    public ConnectionImpl(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return String.format("User name: %s\nUser pass: %s", user.getNick(), user.getPass());
    }

    @Override
    public void getConnection() {
        // TODO Auto-generated method stub

    }
}

class NullConnection implements Connection {
    User user;

    public NullConnection() {
        this.user = new User("default", "default");
    }

    @Override
    public String toString() {
        return String.format("User name: %s\nUser pass: %s", user.getNick(), user.getPass());
    }

    @Override
    public void getConnection() {
        // TODO Auto-generated method stub

    }
}

class User {
    public User(String nick, String pass) {
        this.nick = nick;
        this.pass = pass;
    }

    private String nick;
    private String pass;

    public String getPass() {
        return pass;
    }

    public String getNick() {
        return nick;
    }

}