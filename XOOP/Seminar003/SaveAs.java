public class Program {

    public static void main(String[] args) {
        Document doc = new Document();
        doc.setWorker(new Worker(22, 221, "Какое-то имя"));

        doc.SaveAs();// Save html
        // xml
        // <xml>
        // <Worker>
        // <age>22</age>
        // <salary>221</salary>
        // <name>Какое-то имя</name>
        // </Worker>
        // </xml>

        // md
        doc.SaveAs();// Save md
        // # Worker
        // * age 22
        // * salary 221
        // * name Какое-то имя

        // json
        doc.SaveAs();// Save json
        // {
        // "worker" : {
        // "age":22,
        // "salary":221,
        // "name":"Какое-то имя",
        // }
        // }
    }
}

class Document {
    Button button;

    public void setWorker(int age, int salary, String name) {
        // Worker.age = age;
    }

    public void SaveAs() {
        // ...
    }
}

class Button {

    public void click() {
        // ...
    }
}

class Worker {
    public int age;
    public int salary;
    public String name;

}