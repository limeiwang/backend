// public class index {
//     public static void main(String[] args) {
//         Student s = new Student("Xiao Ming", 12, 89);
//         System.out.println(s);
//     }
// }
// class Person {
//     protected String name;
//     protected int age;

//     public Person(String name, int age) {
//         this.name = name;
//         this.age = age;
//     }
// }

// class Student extends Person {
//     protected int score;

//     public Student(String name, int age, int score) {
//         super(name, age); // 调用父类的构造方法Person(String, int)
//         this.score = score;
//     }
// }


// 多态
public class Main {
    public static void main(String[] args) {
        // 给一个有普通收入、工资收入和享受国务院特殊津贴的小伙伴算税:
        Income[] incomes = new Income[] {
            new Income(3000),
            new Salary(7500),
            new StateCouncilSpecialAllowance(15000)
        };
        System.out.println(totalTax(incomes));
    }

    public static double totalTax(Income... incomes) {
        double total = 0;
        for (Income income: incomes) {
            total = total + income.getTax();
        }
        return total;
    }
}

class Income {
    protected double income;

    public Income(double income) {
        this.income = income;
    }

    public double getTax() {
        return income * 0.1; // 税率10%
    }
}

class Salary extends Income {
    public Salary(double income) {
        super(income);
    }

    @Override
    public double getTax() {
        if (income <= 5000) {
            return 0;
        }
        return (income - 5000) * 0.2;
    }
}

class StateCouncilSpecialAllowance extends Income {
    public StateCouncilSpecialAllowance(double income) {
        super(income);
    }

    @Override
    public double getTax() {
        return 0;
    }
}