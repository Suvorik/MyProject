package turlo.lesson3;

public class EmpArray {
    public static void main(String[] args) {
        EmpArray[] empArray = new EmpArray[5];
        empArray[0] = new EmpArray("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", 892312312, 30000, 30);
        empArray[1] = new EmpArray("Svetlakov Petr", "Developer", "svet.petr@mailbox.com", 892565022, 60000, 41);
        empArray[2] = new EmpArray("Sidorov Sergey", "Analyst", "sids@mailbox.com", 892306215, 55000, 45);
        empArray[3] = new EmpArray("Petrova Kate", "Web designer", "p.kate@mailbox.com", 892065908, 36000, 38);
        empArray[4] = new EmpArray("Cvetkova Alina", "QA Engineer", "cvetok@mailbox.com", 892159357, 25000, 25);

        for (int i = 0; i < empArray.length; i++) {
            if (empArray[i].getAge() > 40) {
                empArray[i].print();
            }
        }

    }

    private String name;
    private String post;
    private String email;
    private long telephone;
    private long salary;
    private int age;

    public EmpArray(String name, String post, String email, long telephone, long salary, int age) {
        this.name = name;
        this.post = post;
        this.email = email;
        this.telephone = telephone;
        this.salary = salary;
        this.age = age;

    }

    public int getAge() {
        return age;
    }

    public void print() {
        System.out.println("ФИО: " + name + " " + "Должность:" + post + " " + " e-mail:" + email + " " + "телефон:"
                + telephone + " " + "Зарплата:" + salary + " " + "Возраст:" + age + " ");

    }
}

