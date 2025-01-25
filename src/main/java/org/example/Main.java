package org.example;

public class Main {
    public static void main(String[] args) {
        // Задание 1 и 2: Работа с сотрудниками
        Employee[] employees = new Employee[5];

        employees[0] = new Employee("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "89231231212", 30000, 30);
        employees[1] = new Employee("Petrov Petr", "Manager", "petrov@mailbox.com", "89231231213", 40000, 35);
        employees[2] = new Employee("Sidorov Sidr", "Developer", "sidorov@mailbox.com", "89231231214", 50000, 28);
        employees[3] = new Employee("Kozlov Kozma", "Designer", "kozlov@mailbox.com", "89231231215", 35000, 40);
        employees[4] = new Employee("Smirnov Smirna", "Analyst", "smirnov@mailbox.com", "89231231216", 45000, 32);

        System.out.println("Информация о сотрудниках:");
        for (Employee employee : employees) {
            employee.printInfo();
        }

        // Задание 3: Работа с аттракционами
        Park park = new Park();

        Park.Attraction rollerCoaster = park.new Attraction("Roller Coaster", "10:00 - 22:00", 150);
        Park.Attraction ferrisWheel = park.new Attraction("Ferris Wheel", "11:00 - 20:00", 100);
        Park.Attraction hauntedHouse = park.new Attraction("Haunted House", "12:00 - 18:00", 200);

        System.out.println("Информация об аттракционах:");
        rollerCoaster.printAttractionInfo();
        ferrisWheel.printAttractionInfo();
        hauntedHouse.printAttractionInfo();
    }
}
