package lesson5;

public class Employee {
    private String surname;
    private String name;
    private String secondname;
    private String title;
    private String email;
    private String phone;
    private int salary;

    private int age;

    public Employee(String name, String surname, String secondname, String title, String email, String phone, int salary, int age) {
        this.surname = surname;
        this.name = name;
        this.secondname = secondname;
        this.title = title;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

     void printInfo(){
        System.out.println(String.format("Сотрудник: %s %s %s Должность сотрудника: %s Электронная почта: %s Телефон: %s Зарплата: %s Возраст: %s\n", surname,name,secondname,title,email,phone,salary,age));
    }


    public int getAge() {
        return age;
    }

}
