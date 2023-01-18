/**
 * Worker
 */

public class Worker {
    int age;
    int salary;
    String fullName;

    public Integer getWorkerAge() {
        return age;
    }

    public Integer getWorkerSalary() {
        return salary;
    }

    public String getWorkerName() {
        return fullName;
    }

    public String getWorkerData() {
        return String.format("fullName:%s \nage: %d \nsalary: %d", fullName, age, salary);
    }
}

class WorkerBuilder {
    Worker worker;

    private WorkerBuilder() {
        super();
    }

    public WorkerBuilder create(int i) {
        worker = new Worker();
        return this;
    }

    public WorkerBuilder setWorkerAge(Integer age) {
        worker.age = age;

        return this;
    }

    public WorkerBuilder getWorkerSalary(Integer salary) {
        worker.salary = salary;

        return this;
    }

    public WorkerBuilder getWorkerName(String fullName) {
        worker.fullName = fullName;

        return this;
    }

    public Worker build() {
        return worker;
    }

}
