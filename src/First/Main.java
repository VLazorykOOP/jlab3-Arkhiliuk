package First;
public class Main {

    public static void main(String[] args) {
        Person A = new Person("pers A");
        Official B = new Official("official B", "pers B");
        Worker C = new Worker("pers C", "worker C");
        Engineer D = new Engineer("official D", "pers D", "engineer D");
        A.show();
        System.out.println();
        B.show();
        System.out.println();
        C.show();
        System.out.println();
        D.show();
        System.out.println();
    }
}
