public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Person p = new Person("xiao ming");

        System.out.println(p.name);
        Person.number = 1234;
        System.out.println(Person.number);
        // Person1 r = new Person1();
        // r.run();
        // System.out.println();
    }
}


class Person {
    String name;
    static int number;
    public Person(String name) {
        this.name = name;
    }
    public String getName() {
        return this.name;
    }
}