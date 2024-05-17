import java.util.Scanner;

public class ActivitySelector {
    public static void main(String[] args) {
        // Создаем объект Scanner для считывания ввода пользователя
        Scanner scanner = new Scanner(System.in);

        // Запрашиваем и считываем значения параметров с консоли
        System.out.println("Введите '1', если уже ночь, иначе введите '2':");
        boolean isNight = scanner.nextBoolean();

        System.out.println("Введите '1', если на улице хорошая погода, иначе введите '2':");
        boolean isGoodWeather = scanner.nextBoolean();

        // Определяем возможные варианты активностей
        String activity = "";

        // Проверяем условия и выбираем соответствующую активность
        if (isNight) {
            activity = "Спать";
        } else if (isGoodWeather) {
            activity = "Гулять";
        } else {
            activity = "Читать книгу";
        }

        // Выводим выбранную активность
        System.out.println(activity);

        // Закрываем Scanner
        scanner.close();
    }
}
