/**
 * @file 静态字段和静态方法
 */
public class Main {
    public static void main(String[] arge) {
        Person ming = new Person("xiao ming", 12);
        Person hong = new Person("xiao hong", 16);

        Person.number = 88;
        System.out.println(Person.number);
        Person.number = 99;
        System.out.println(Person.number);

        Person.setNumber(123454);
        System.out.println(Person.number);
    }
}

// public interface Person {
    // public static final int MALE = 1;
    // public static final int FEMALE = 2;
    // 简写
    // int MALE = 1;
    // int FEMALE = 2;
// }

class Person {
    public String name;
    public int age;

    // 定义静态字段number:
    public static int number;

    public long count; // 长整型
    public byte num; // 短整型

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // 定义静态方法
    public static void setNumber(int value) {
        // 因为静态方法属于class而不属于实例，因此，静态方法内部，无法访问this变量，也无法访问实例字段，它只能访问静态字段。
        number = value;
    }
}
