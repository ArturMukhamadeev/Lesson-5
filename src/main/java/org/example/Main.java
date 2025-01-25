
public class Main {
    public static void main(String[] args) {
        // Создание массива из 5 сотрудников
        Employee[] employees = new Employee[5];


        employees[0] = new Employee("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "89231231212", 30000, 30);
        employees[1] = new Employee("Petrov Petr", "Manager", "petrov@mailbox.com", "89231231213", 40000, 35);
        employees[2] = new Employee("Sidorov Oleg", "Developer", "sidorov@mailbox.com", "89231231214", 50000, 28);
        employees[3] = new Employee("Kozlov Sergey", "Designer", "kozlov@mailbox.com", "89231231215", 35000, 40);
        employees[4] = new Employee("Smirnov Ivan", "Analyst", "smirnov@mailbox.com", "89231231216", 45000, 32);


        for (Employee employee : employees) {
            employee.printInfo();
        }
    }
}
