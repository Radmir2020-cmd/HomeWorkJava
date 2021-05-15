package HW5;

public class HornsAndHooves {

    public static void main(String[] args) {

//        Employee employee = new Employee("Пупкин Иван Иванович","engineer", "pupkini@mail.ru", "8(919)919-19-19", 30000, 30);

        Employee[] employeeArray = new Employee[5]; // создаем массив объектов работяги и заполняем его
        employeeArray[0] = new Employee("Петров Петр Петрович", "Менеджер", "petrovpp@mail.ru", "8(916)123-54-78", 45000, 42);
        employeeArray[1] = new Employee("Александров Александр Александрович", "Экономист", "aleksandrovaa@mail.ru", "8(926)456-23-19", 50000,40 );
        employeeArray[2] = new Employee("Зайцев Александр Петрович", "Моторист", "zaycevap@mail.ru", "8(930)098-19-19", 55000,40 );
        employeeArray[3] = new Employee("Коксов Алексей Геннадьевич", "Генеральный директор", "koksovag@mail.ru", "8(999)333-45-19", 100000,52 );
        employeeArray[4] = new Employee("Лушной Дмитрий Григорьевич", "Администратор", "lushnoydg@mail.ru", "8(909)200-34-12", 50000,27 );


//        System.out.println("Меня зовут " + employee.fullName); // выводим в консоль Меня зовут
//        System.out.println("Занимаю должность " + employee.position); // выводим в консоль Занимаю должность
//        System.out.println("Моя почта " + employee.email); // выводим в консоль моя почта
//        System.out.println("Номер телефона " + employee.telNumber); // выводим в консоль Номер телефона
//        System.out.println("Зарплата " + employee.salary); // выводим в консоль Зарплата
//        System.out.println("Возраст " + employee.age); // выводим в консоль возраст

     getAllEmployee(employeeArray); // печатает в консоль методы
     System.out.println("----------------------");
     getOldPerson(employeeArray, 40);
     System.out.println("----------------------");
     getFullName(employeeArray);
     System.out.println("----------------------");
     getPosition(employeeArray);
     System.out.println("----------------------");
     getEmail(employeeArray);
     System.out.println("----------------------");
     getTelNumber(employeeArray);
     System.out.println("----------------------");
     getSalary(employeeArray);
     System.out.println("----------------------");
     getAge(employeeArray);
    }

    private static void getAllEmployee(Employee[] office) { // метод по выводу всей инфы
        System.out.println("Состав: "); // прописывает Слово "Состав:"
        for (int i = 0; i < office.length; i++) // цикл который проходит по всему списку
            System.out.println((i + 1) + " " + office[i].getInfo()); // выводит списком из метода гетИнфо


    }

    private static void getOldPerson(Employee[] office, int age) {
        for (int i = 0; i < office.length; i++)
            if (office[i].getAge() > age) {
                System.out.println(office[i].getInfo());
            }

    }

    private static void getFullName(Employee[] office) { // метод по выводу списком ФИО
        System.out.println("ФИО: "); // прописывает Слово "ФИО:"
        for (int i = 0; i < office.length; i++) // цикл который проходит по всему списку
            System.out.println((i + 1) + " " + office[i].getFullName()); // выводит списком из метода гетИнфо
    }

    private static void getPosition(Employee[] office) { // метод по выводу списком должности
        System.out.println("Должность: "); // прописывает Слово "Должность:"
        for (int i = 0; i < office.length; i++) // цикл который проходит по всему списку
            System.out.println((i + 1) + " " + office[i].getPosition()); // выводит списком из метода гетПосижн
    }

    private static void getEmail(Employee[] office) { // метод по выводу списком почты
        System.out.println("Почта: "); // прописывает Слово "Почта:"
        for (int i = 0; i < office.length; i++) // цикл который проходит по всему списку
            System.out.println((i + 1) + " " + office[i].getEmail()); // выводит списком из метода гетЭмэйл
    }

    private static void getTelNumber(Employee[] office) { // метод по выводу списком телона
        System.out.println("Номер телефона: "); // прописывает Слово "Номер телефона:"
        for (int i = 0; i < office.length; i++) // цикл который проходит по всему списку
            System.out.println((i + 1) + " " + office[i].getTelNumber()); // выводит списком из метода гетНамбер
    }

    private static void getSalary(Employee[] office) { // метод по выводу списком зэпэ
        System.out.println("Кровные: "); // прописывает Слово "Кровные:"
        for (int i = 0; i < office.length; i++) // цикл который проходит по всему списку
            System.out.println((i + 1) + " " + office[i].getSalary()); // выводит списком из метода гетСалари
    }

    private static void getAge(Employee[] office) { // метод по выводу списком сколько лет
        System.out.println("Годков: "); // прописывает Слово "Годков:"
        for (int i = 0; i < 2; i++) // цикл который проходит по всему списку до второго
            System.out.println((i + 1) + " " + office[i].getAge()); // выводит списком из метода гетЭйдж
    }



}
