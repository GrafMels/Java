///Дописать

import java.util.ArrayList;

/**
 * Program
 */
public class Program {
    public static void main(String[] args) {
        House house = new House();
        Repository repo = new Repository();
        repo.append(new Worker(22, 2345, "Имя_1", "Фамилия_1", new Adress("Klinovaya")));
        repo.append(new Worker(33, 3456, "Имя_2", "Фамилия_2", new Adress("Sovetskaya")));
        repo.append(new Worker(44, 4567, "Имя_3", "Фамилия_3", new Adress("Radujnaya")));
        repo.append(new Worker(55, 5678, "Имя_4", "Фамилия_4", new Adress("Svetlaya")));
        repo.append(new Worker(66, 6789, "Имя_5", "Фамилия_5", new Adress("Pobedi")));
        repo.append(new Worker(77, 7890, "Имя_6", "Фамилия_6", new Adress("Lol")));
        repo.append(new Worker(88, 8901, "Имя_7", "Фамилия_7", new Adress("Kak")));
        repo.append(new Worker(99, 9012, "Имя_8", "Фамилия_8", new Adress("Ya")));
        repo.append(new Worker(50, 1123, "Имя_9", "Фамилия_9", new Adress("Uje")));
        repo.append(new Worker(11, 1234, "Имя_0", "Фамилия_0", new Adress("Zaebalsya")));
        var worker1 = repo.getWorkerBy(0);
        worker1.adress.adress = "Pupa";
        System.out.println(repo);

    }
}

class Worker implements Cloneable {

    private int age;
    private int salary;
    private String firstName;
    private String lastName;
    public Adress adress;

    @Override
    protected Object clone() {
        return new Worker(age, salary, firstName, lastName, adress);
    }

    public Worker(int age, int salary, String firstName, String lastName, Adress adress) {
        this.age = age;
        this.salary = salary;
        this.firstName = firstName;
        this.lastName = lastName;
        this.adress = adress;
    }

    String getFullName() {
        return firstName + "" + lastName;
    }

    String getFull() {
        return firstName + " " + lastName + " " + age + " " + salary;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(firstName);
        sb.append(" ");
        sb.append(lastName);
        sb.append(" ");
        sb.append(age);
        sb.append(" ");
        sb.append(salary);
        sb.append(" ");
        sb.append(adress);
        return sb.toString();

    }
}

class Repository {
    private ArrayList<Worker> db;

    public Repository() {
        db = new ArrayList<>();
    }

    public void append(Worker w) {
        db.add((Worker) w.clone());
    }

    public Worker getWorkerBy(int id) {
        return (Worker) db.get(id).clone();
    }

    public void printFull() {
        String fullInf = "";
        int count = 0;
        for (Worker worker : db) {

            if (count != 0) {
                fullInf += "\n" + worker.getFull();
            } else {
                fullInf += worker.getFull();
                count++;
            }

        }
        System.out.println(fullInf);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        int count = 0;
        for (Worker worker : db) {
            if (count != 0) {
                sb.append("\n");
                sb.append(worker);
            } else {
                sb.append(worker);
                count++;
            }
        }
        return sb.toString();
    }
}

class Adress implements Cloneable {
    public String adress;
    public City city;
    public Street street;
    public House house;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    Adress(String adress) {
        this.adress = adress;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(adress);
        return sb.toString();

    }

}

class City {
    String city;
    Street street;
}

class Street {
    House house;
    String string;
}

class House implements Cloneable {
    House house;
    String irl;

    public House() {
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return new House();
    }
}