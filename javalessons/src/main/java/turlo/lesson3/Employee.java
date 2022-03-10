package turlo.lesson3;

public class Employee {
    public  static void main(String[] args) {
        print();
    }

    private static String name;
    private static String post;
    private static String email;
    private static long telephone;
    private static long salary;
    private static int age;

    public Employee(String name, String post, String email, long telephone, long salary, int age) {
        this.name = name;
        this.post = post;
        this.email = email;
        this.telephone = telephone;
        this.salary = salary;
        this.age = age;

    }

    public static void print() {
        System.out.println("ФИО: " + name + " " + "Должность:" + post + " " + " e-mail:" + email + " " + "телефон:"
                + telephone + " " + "Зарплата:" + salary + " " + "Возраст:" + age + " ");
    }
}
