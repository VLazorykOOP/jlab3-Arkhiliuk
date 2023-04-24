package First;

public class Official extends Person {
    String OfficialName;
    Official() {
        OfficialName = "none";

        PersonName = "none";
    }
    Official(String o, String p) {
        OfficialName = o;
        PersonName = p;
    }
    public void show() {
        System.out.printf("Person: %s\n", PersonName);
        System.out.printf("Official: %s\n", OfficialName);
    }
}
