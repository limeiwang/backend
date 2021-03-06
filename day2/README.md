# Java程序基础
一个完整的Java程序，它的基本结构是什么：

``` java 
/**
 * 可以用来自动创建文档的注释
 */
public class Hello {
    public static void main(String[] args) {
        // 向屏幕输出文本:
        System.out.println("Hello, world!");
        /* 多行注释开始
        注释内容
        注释结束 */
    }
} // class定义结束
```
因为Java是面向对象的语言，一个程序的基本单位就是class，class是关键字，这里定义的class名字就是Hello：

``` java
public class Hello { // 类名是Hello
    // ...
} // class定义结束
```

**类名要求：**
- 类名必须以英文字母开头，后接字母，数字和下划线的组合
- 习惯以大写字母开头

**要注意遵守命名习惯，好的类命名：**
- Hello
- NoteBook
- VRPlayer

**不好的类命名：**
- hello
- Good123
- Note_Book
- _World

注意到`public`是访问修饰符，表示该`class`是公开的。
不写`public`，也能正确编译，但是这个类将无法从命令行执行。

在`class`内部，可以定义若干方法（method）：
``` java
public class Hello {
    public static void main(String[] args) { // 方法名是main
        // 方法代码...
    } // 方法定义结束
}
```

方法定义了一组执行语句，方法内部的代码将会被依次顺序执行。
这里的方法名是`main`，返回值是`void`，表示没有任何返回值。

我们注意到`public`除了可以修饰`class`外，也可以修饰方法。而关键字`static`是另一个修饰符，它表示静态方法，后面我们会讲解方法的类型，目前，我们只需要知道，Java入口程序规定的方法必须是静态方法，方法名必须为`main`，括号内的参数必须是String数组。

**好的方法命名：**
- main
- goodMorning
- playVR

**不好的方法命名：**
- Main
- good123
- good_morning
- _playVR

在方法内部，语句才是真正的执行代码。Java的每一行语句必须以分号结束：
``` java
public class Hello {
    public static void main(String[] args) {
        System.out.println("Hello, world!"); // 语句
    }
}
```

在Java程序中，注释是一种给人阅读的文本，不是程序的一部分，所以编译器会自动忽略注释。

Java有3种注释，第一种是单行注释，以双斜线开头，直到这一行的结尾结束：
``` java 
// 这是注释...
```
而多行注释以/*星号开头，以*/结束，可以有多行：
``` java
/*
这是注释
blablabla...
这也是注释
*/
```
还有一种特殊的多行注释，以/**开头，以*/结束，如果有多行，每行通常以星号开头：
``` java
/**
 * 可以用来自动创建文档的注释
 * 
 * @auther limeiwang
 */
public class Hello {
    public static void main(String[] args) {
        System.out.println("Hello, world!");
    }
}
```

## 基本数据类型
基本数据类型是CPU可以直接进行运算的类型。Java定义了以下几种基本数据类型：

- 整数类型：byte，short，int，long
- 浮点数类型：float，double
- 字符类型：char
- 布尔类型：boolean