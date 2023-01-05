import java.util.HashMap;
import java.util.Map;

/**
 * Objects
 */

class Nexus {
    protected static Map<Double, String> kinship = new HashMap<Double, String>();
    public static int count = 0;

    public void createMother(String name) {
        kinship.put(count + 0.1, name);
    }

    public void createFather(String name) {
        kinship.put(count + 0.2, name);
    }

    public static void getIndex() {
        String indexes = "";

        for (int i = 0; i < Controller.name.size(); i++) {
            if (Controller.name.get(i).kinship.get(i + 0.1) == null
                    & Controller.name.get(i).kinship.get(i + 0.2) == null) {
                indexes += String.format("%d: %s\n", i, Controller.family.get(i));
            }
        }
        System.out.println(indexes);
    }
}
