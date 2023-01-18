
import work.Worker;

public class WorkerBuilder {

    Worker t;
    static WorkerBuilder wb;

    public static WorkerBuilder getInstance() {
        if (wb == null)
            wb = new WorkerBuilder();

        wb.t = new Worker();
        return wb;
    }

    private WorkerBuilder() {

    }

    public WorkerBuilder setAge(int age) {
        t.age = age;
        return this;
    }

    public WorkerBuilder setSalary(int salary) {
        t.salary = salary;
        return this;
    }

    public WorkerBuilder setFullName(String fullName) {
        t.fullName = fullName;
        return this;
    }

    public Worker build() {
        return t;
    }

}