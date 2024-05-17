// Класс Человек
class Person {
    // Поля класса Person
    private String name;
    private int age;
    private double weight;

    // Конструктор для инициализации полей
    public Person(String name, int age, double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    // Геттер для возраста
    public int getAge() {
        return age;
    }
}

// Класс Simple для демонстрации работы программы
public class Simple {
    public static void main(String[] args) {
        // Создание пяти экземпляров класса Person
        Person person1 = new Person("Иван", 25, 70.5);
        Person person2 = new Person("Мария", 30, 65.0);
        Person person3 = new Person("Петр", 20, 80.0);
        Person person4 = new Person("Анна", 28, 55.5);
        Person person5 = new Person("Дмитрий", 35, 90.0);

        // Вычисление среднего возраста
        int totalAge = person1.getAge() + person2.getAge() + person3.getAge() + person4.getAge() + person5.getAge();
        double averageAge = totalAge / 5.0;

        // Вывод среднего возраста на экран
        System.out.println("Средний возраст: " + averageAge);
    }
}
