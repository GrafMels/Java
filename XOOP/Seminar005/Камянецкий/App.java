import work.Worker;

public class App {
  public static void main(String[] args) {

    WorkerBuilder wb;
    Worker w = WorkerBuilder.getInstance()
        .setAge(22)
        .setFullName("null")
        .setSalary(2222)
        .build();

    System.out.println(w);
    Worker w1 = WorkerBuilder.getInstance()
        .setAge(11)
        .setFullName("qweqw")
        .setSalary(11111)
        .build();

    System.out.println(w);
    System.out.println(w1);

  }
}
