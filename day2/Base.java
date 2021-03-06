public class Base {
    public static void main(String[] srgs) {
        int x = 100; // 定义int类型变量x，并赋予初始值100
        System.out.println(x); // 打印该变量的值
        x = 2000; // 重新赋值为2000
        System.out.println(x); // 重新打印

        int m = x;
        System.out.println(m);

        m = m + 100;
        System.out.println("x = " + m);
        System.out.println("x = " + x);
    }
}

