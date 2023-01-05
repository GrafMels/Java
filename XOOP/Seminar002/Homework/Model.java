public class Model {
    public static void createNexus() {
        Controller.family.add(View.inputNexusName());
        Controller.name.add(new Nexus());

        String motherName = View.inputMotherName();
        Controller.name.get(Controller.count).createMother(motherName);
        Controller.count++;
        Controller.family.add(motherName);
        Controller.name.add(new Nexus());

        String fatherName = View.inputFatherName();
        Controller.name.get(Controller.count).createFather(fatherName);
        Controller.count++;
        Controller.family.add(fatherName);
        Controller.name.add(new Nexus());

        Nexus.count++;
        Nexus.count++;

        boolean condition = View.inputSiblings();
        if (condition) {

            String siblingName = View.inputSiblingName();
            Controller.family.add(siblingName);
            Controller.count++;
            Nexus.count++;
            Controller.name.add(new Nexus());
            Controller.name.get(Controller.count).createMother(motherName);
            Controller.name.get(Controller.count).createFather(fatherName);

            condition = View.inputSibling();
            while (condition) {

                siblingName = View.inputSiblingName();
                Controller.family.add(siblingName);
                Controller.count++;
                Nexus.count++;
                Controller.name.add(new Nexus());
                Controller.name.get(Controller.count).createMother(motherName);
                Controller.name.get(Controller.count).createFather(fatherName);

                condition = View.inputSibling();
            }
        }
    }

    public static void oldNexus(int index) {

        String motherName = View.inputMotherName();
        int x = Nexus.count;
        Nexus.count = index;
        Controller.name.get(index).createMother(motherName);
        index++;
        Controller.family.add(motherName);
        Controller.name.add(new Nexus());

        String fatherName = View.inputFatherName();
        Controller.name.get(index).createFather(fatherName);
        index++;
        Controller.family.add(fatherName);
        Controller.name.add(new Nexus());

        Nexus.count = x;
        Nexus.count++;
        Nexus.count++;

        boolean condition = View.inputSiblings();
        if (condition) {

            String siblingName = View.inputSiblingName();
            Controller.family.add(siblingName);
            index++;
            Nexus.count++;
            Controller.name.add(new Nexus());
            Controller.name.get(Controller.count).createMother(motherName);
            Controller.name.get(index).createFather(fatherName);

            condition = View.inputSibling();
            while (condition) {

                siblingName = View.inputSiblingName();
                Controller.family.add(siblingName);
                index++;
                Nexus.count++;
                Controller.name.add(new Nexus());
                Controller.name.get(index).createMother(motherName);
                Controller.name.get(index).createFather(fatherName);

                condition = View.inputSibling();
            }
        }
    }

}
