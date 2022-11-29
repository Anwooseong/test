package modules;

public class Foo {
    public void printName() {
        String name = "name";
        System.out.println(name);
        extracted(name);
        System.out.println(name);
    }

    private void extracted(String name) {
        System.out.println(name);
        System.out.println(name);
        System.out.println(name);
    }
}
