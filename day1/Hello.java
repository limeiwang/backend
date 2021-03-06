// 这个定义被称为class（类）
public class Hello {
    // 类的定义中，我们定义了一个名为main的方法：
    // public、static用来修饰方法
    public static void main(String[] args) {
        System.out.println("Hello, world!");
    }
}

// 如何运行java程序

// 第一步，在保存Hello.java的目录下执行命令javac Hello.java
// 第二步，执行Hello.class，使用命令java Hello
// 注意：给虚拟机传递的参数Hello是我们定义的类名，虚拟机自动查找对应的class文件并执行。

// 直接运行java Hello.java也是可以的：
// 这是Java 11新增的一个功能，它可以直接运行一个单文件源码！
// 需要注意的是，在实际项目中，单个不依赖第三方库的Java源码是非常罕见的，所以，绝大多数情况下，我们无法直接运行一个Java源码文件，原因是它需要依赖其他的库。