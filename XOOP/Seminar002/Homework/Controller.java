import java.util.LinkedList;

public class Controller {
    public static LinkedList<String> family = new LinkedList<>();
    public static LinkedList<Nexus> name = new LinkedList<>();
    public static Integer count = 0;

    public static void run() {

        Model.createNexus();
        int index = View.choice();
        while (index != 0) {
            Model.oldNexus(index);
            index = View.choice();
        }
        index = 1;
        while (index != 0) {
            int i = View.newSeach();
            int condition = View.menuSeacheching();
            if (String.valueOf(condition).equals("1")) {

                int[] siblings = Model.siblingsSeach(i);
                System.out.println();
                System.out.print("Родные братья/сёстры: ");
                for (int j : siblings) {
                    if (j != i) {
                        System.out.printf("%s ", family.get(j));
                    }
                }
                System.out.println();
                System.out.println();

            } else if (String.valueOf(condition).equals("2")) {

                System.out.println();
                int number = Model.spousesParents(i);
                System.out.print("Свекровь/Тёщя: ");
                System.out.println(name.get(number).kinship.get(number + 0.1));
                System.out.print("Свёкор/Тесть: ");
                System.out.println(name.get(number).kinship.get(number + 0.2));
                System.out.println();

            } else if (String.valueOf(condition).equals("3")) {

                int[] siblings = Model.siblingsSeach(i + 0.1);
                System.out.println();
                System.out.print("Дяди и тёти по маменой линии: ");
                for (int j : siblings) {
                    if (!family.get(j).equals(family.get(i + 1))) {
                        System.out.printf("%s ", family.get(j));
                    }
                }
                System.out.println();
                System.out.println();

                siblings = Model.siblingsSeach(i + 0.2);
                System.out.println();
                System.out.print("Дяди и тёти по папеной линии: ");
                for (int j : siblings) {
                    if (!family.get(j).equals(family.get(i + 2))) {
                        System.out.printf("%s ", family.get(j));
                    }
                }
                System.out.println();
                System.out.println();

            } else if (String.valueOf(condition).equals("4")) {
                index = 0;
            }

        }
        System.out.println(family);
        View.saveInFile();
    }

}
