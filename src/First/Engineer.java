package First;

public class Engineer extends Official {
    String EngineerName;
    Engineer() {
        OfficialName = "none";
        PersonName = "none";
        EngineerName = "none";
    }
    Engineer(String o, String p, String e) {
        OfficialName = o;
        PersonName = p;
        EngineerName = e;
    }
    public void show() {
        System.out.printf("Person: %s\n", PersonName);
        System.out.printf("Official: %s\n", OfficialName);
        System.out.printf("Engineer: %s\n", EngineerName);
    }
}
