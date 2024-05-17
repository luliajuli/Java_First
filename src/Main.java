// Класс Dog
class Dog {
    // Поля класса Dog
    private String name;
    private String breed;
    private int speed;

    // Конструктор для инициализации полей
    public Dog(String name, String breed, int speed) {
        this.name = name;
        this.breed = breed;
        this.speed = speed;
    }

    // Метод run
    public void run() {
        for (int i = 0; i < speed; i++) {
            System.out.print("бегу ");
        }
        System.out.println(); // Переход на новую строку после вывода всех "бегу"
    }

    // Метод info, возвращающий строку с полной информацией о собаке
    public String info() {
        return "Кличка: " + name + ", Порода: " + breed + ", Скорость: " + speed;
    }
}

// Класс Main для демонстрации работы методов
public class Main {
    public static void main(String[] args) {
        // Создание объекта Dog
        Dog myDog = new Dog("Барбос", "Овчарка", 5);

        // Демонстрация работы метода run
        myDog.run();

        // Демонстрация работы метода info
        System.out.println(myDog.info());
    }
}
