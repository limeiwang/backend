/**
 * @file 接口(interface)
 */
public class Main {
    public static void main(String[] args) {
        Person p = new Student("Xiao Ming");
        p.run();
    }
}

interface Hello {
    void hello();
}

interface Person extends Hello {
    void run();
    String getName();
}

class Student implements Person {
    private String name;


    public Student (String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println(this.name + "run");
    }

    @Override
    public String getName() {
        System.out.println(this.name);
        return this.name;
    }

    @Override
    public void hello() {}
}
