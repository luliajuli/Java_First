import java.util.Scanner;

public class PurchaseAdvisor {
    public static void main(String[] args) {
        // Создаем объект Scanner для считывания ввода пользователя
        Scanner scanner = new Scanner(System.in);

        // Запрашиваем и считываем количество денег в кармане
        System.out.println("Сколько у вас денег в кармане?");
        int money = scanner.nextInt();

        // Определяем, что купить в зависимости от количества денег
        String purchase = "";

        if (money > 500) {
            purchase = "Пицца";
        } else if (money >= 300 && money <= 500) {
            purchase = "Шаурма";
        } else if (money >= 100 && money < 300) {
            purchase = "Гамбургер";
        } else {
            purchase = "Доширак";
        }

        // Выводим совет по покупке
        System.out.println("Вам стоит купить: " + purchase);

        // Закрываем Scanner
        scanner.close();
    }
}

