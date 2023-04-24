package First;

public class Worker extends Person{
    String WorkerName;
    Worker() {
        PersonName = "none";
        WorkerName = "none";
    }
    Worker(String p, String w) {
        PersonName = p;
        WorkerName = w;
    }
    public void show() {
        System.out.printf("Person: %s\n", PersonName);
        System.out.printf("Worker: %s\n", WorkerName);
    }
}
