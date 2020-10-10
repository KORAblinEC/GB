package ru.geekbrains.lesson5;
//1. Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст.
public class Employee {
    private String fio;
    private String position;
    private String email;
    private String phone;
    private Integer salary;
    private int age;
//2. Конструктор класса должен заполнять эти поля при создании объекта.
    public Employee(String fio, String position, String email, String phone, Integer salary, int age) {
        this.fio = fio;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }
//3. Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль.
    public static void main(String[] args) {
        Employee employee1 = new Employee("Иванов Иван Иванович", "Директор", "director@gb.ru", "89101111111111", 100000, 30);
        System.out.println("Сотрудник по фамилии " + employee1.fio + " , занимает позицию " + employee1.position + " , рабочий email: " + employee1.email + " , рабочий телефон: " + employee1.phone + " , доход по зарплатной ведомости " + employee1.salary +
                " рублей, возраст сотрудника " + employee1.age);
        System.out.println();
//4. Создать массив из 5 сотрудников.
        Employee[] empArray = new Employee[5];
        empArray[0] = new Employee("Петров Иван Иванович", "Заместитель директор", "zamdirector@gb.ru", "89101111111112", 90000, 25);
        empArray[1] = new Employee("Сидоров Иван Иванович", "Технический директор", "tehdirector@gb.ru", "89101111111113", 95000, 45);
        empArray[2] = new Employee("Иванов Сидор Иванович", "Уборщик", "uborka@gb.ru", "89101111111114", 25000, 63);
        empArray[3] = new Employee("Иванов Аглая Францевна", "Бухгалтер", "buh@gb.ru", "89101111111115", 150000, 95);
        empArray[4] = new Employee("Сидоров Иван Апполинарьевич", "Охранник", "OXPAHA@gb.ru", "89101111111116", 40000, 80);
//5. С помощью цикла вывести информацию только о сотрудниках старше 40 лет.
        for (int i=0; i< empArray.length;i++){
            if (empArray[i].age>40){
                System.out.println("Сотрудник по фамилии " + empArray[i].fio + " , занимает позицию " + empArray[i].position + " , рабочий email: " + empArray[i].email + " , рабочий телефон: " + empArray[i].phone + " , доход по зарплатной ведомости " + empArray[i].salary +
                        " рублей, возраст сотрудника " + empArray[i].age);
            }
        }
    }
}
