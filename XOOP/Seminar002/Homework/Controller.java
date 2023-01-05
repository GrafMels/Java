import java.util.LinkedList;

public class Controller {
    public static LinkedList<String> family = new LinkedList<>();
    public static LinkedList<Nexus> name = new LinkedList<>();
    public static Integer count = 0;

    public static void main(String[] args) {

        Model.createNexus();
        int index = View.choice();
        while (index != 0) {
            Model.oldNexus(index);
            index = View.choice();
        }
        index = 1;
        while (index != 0) {

        }
        System.out.println(family);
        View.saveInFile();
    }

}
