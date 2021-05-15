package HW5;

public class Employee { // создаем класс работяга со скелетом из

    private String fullName;  // ФИО
    private String position; // Занимаемая должность
    private String email; // почта
    private String telNumber; // номер телефона
    private int salary; // зэпэ
    private int age; // возраст

    // конструктор
    public Employee(String fullName, String position, String email, String  telNumber, int salary, int age) { // задаем конструктор с данными
    this.fullName = fullName;
    this.position = position;
    this.email = email;
    this.telNumber = telNumber;
    this.salary = salary;
    this.age = age;
    }

    String getInfo() { // метод по выводу всей инфы
        return this.fullName + " должность: " +
                this.position + " почта: " +
                this.email + " телефон: " +
                this.telNumber + " кровные: " +
                this.salary + " деревянных: " +
                this.age + " годков";
    }

    String getFullName() { // метод по выводу ФИО
        return fullName;
    }

    String getPosition() { // метод по выводу должности
        return position;
    }

    String getEmail() { // метод по выводу почты
        return email;
    }

    String getTelNumber() { // метод по выводу телефона
        return telNumber;
    }

    int getSalary() { // метод по выводу зп
        return salary;
    }

    int getAge() { // метод по выводу возраста
        return age;
    }




}
