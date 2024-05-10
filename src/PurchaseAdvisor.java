import java.util.Scanner;

public class PurchaseAdvisor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int money = getMoneyAmount(scanner);
        String purchase = determinePurchase(money);
        printPurchaseAdvice(purchase);
        scanner.close();
    }

    // Метод для запроса и считывания количества денег в кармане
    private static int getMoneyAmount(Scanner scanner) {
        System.out.println("Сколько у вас денег в кармане?");
        return scanner.nextInt();
    }

    // Метод для определения, что купить в зависимости от количества денег
    private static String determinePurchase(int money) {
        if (money >= 500) {
            return "Пицца";
        } else if (money >= 300) {
            return "Шаурма";
        } else if (money >= 100) {
            return "Гамбургер";
        } else {
            return "Доширак";
        }
    }

    // Метод для вывода совета по покупке
    private static void printPurchaseAdvice(String purchase) {
        System.out.println("Вам стоит купить: " + purchase);
    }
}
