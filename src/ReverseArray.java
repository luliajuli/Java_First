public class ReverseArray {
    public static void main(String[] args) {
        // Создаем первый массив и инициализируем его значениями от 100 до 1000
        int[] firstArray = new int[901]; // Размер массива: 1000 - 100 + 1 = 901
        for (int i = 0; i < firstArray.length; i++) {
            firstArray[i] = 100 + i;
        }

        // Создаем второй массив такой же длины
        int[] secondArray = new int[firstArray.length];

        // Заполняем второй массив значениями из первого, но в обратном порядке
        for (int i = 0; i < firstArray.length; i++) {
            secondArray[i] = firstArray[firstArray.length - 1 - i];
        }

        // Выводим элементы второго массива с помощью цикла for each
        for (int num : secondArray) {
            System.out.println(num);
        }
    }
}
