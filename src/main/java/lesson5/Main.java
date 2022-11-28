package lesson5;

public class Main {

    public static void main(String[] args) {

            Employee[] employeesArray = new Employee[5];
            employeesArray[0] = new Employee("Иван", "Иванов", "Иванович","Админ", "admin@yandex.ru","89114587845",100000,45);
            employeesArray[1] = new Employee("Анна","Колесникова","Сергеевна","Офисный работник","anna212@mail.ru","89114782233",30000,30);
            employeesArray[2] = new Employee("Вася", "Васьков","Олегович","Работник","vasya1234@bk.ru","8741114774",42222,24);
            employeesArray[3] = new Employee("Катя","Вишнякова","Игоревна","Начальник","efeaxf@mail.ru","89994156333",55555,50);
            employeesArray[4] = new Employee("Кирилл","Пивко","Алексеевич","Убошик","weras@mail.ru","89635874541",38000,20);

        for (Employee employee: employeesArray) {
        if (employee.getAge()>40){
            employee.printInfo();
        }
        }

    }
}