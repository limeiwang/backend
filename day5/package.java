public class Main {
    public static void main(String[] arge) {
        Person.setNumber(12345);
        System.out.println(Person.number);
    }
}



class Person {
    public static int number;
    public static void setNumber(int value) {
        number = value;
    }
}