/**
 * @file 继承
 */
public class inherit {
    public static void main (String[] age) {
        Student s = new Student("张三", 27, 89);

        System.out.println(s.hello());
        System.out.println(s.getScore());
        System.out.println(s.name);
        System.out.println(s.age);
    }
}


class Person {
    protected String name;
    protected int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age; 
    }
    public Person() {
    }

    public String getName() {
        return this.name;
    }
    public int getAge() {
        return age;
    }
}


class Student extends Person{
    // 不要重复name和age字段/方法,
    // 只需要定义新增score字段/方法:
    private int score;
    public Student(String name, int age, int score) {
        super(name, age);// 自动调用父类的构造方法
        this.score = score;
    }

    public int getScore() {
        return score;
    }
    public String hello() {
        return "Hello, " + super.name; // OK!
    }
}