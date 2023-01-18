package work;

public class Worker {

  public int age;

  public int salary;

  public int getSalary() {
    return salary;
  }

  public void setSalary(int salary) {
    this.salary = salary;
  }

  public String fullName;

  @Override
  public String toString() {

    return String.format("%d %d %s", age, salary, fullName);
  }

}
