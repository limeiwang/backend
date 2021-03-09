/**
 * @file 方法重载
 */
public class Base {
    public static void main(String[] ages) {
        Person si = new Person();
        Person san = new Person();
        si.setName("Li si");
        san.setName("Zhang", "san");
        System.out.println(si.getName());
        System.out.println(san.getName());

    }
}


class Person {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    // 方法重载
    public void setName(String name, String name2) {
        this.name = name + " " + name2;
    }
}