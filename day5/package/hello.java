package hello;

// 导入完整类名:
import mr.jun.Arrays;

public class Main {
    public static void main(String[] args) {
        Person p = new Person();
        p.hello();
    }
}

public class Person {
    // 包作用域:
    void hello() {
        System.out.println("Hello!");
    }

    public void run() {
        // 1.直接写出完整类名
        mr.jun.Arrays.arrays = new mr.jun.Arrays();
        // 2.用import语句
        Arrays arrays = new Arrays();

    }
}
