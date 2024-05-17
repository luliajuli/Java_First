import java.util.Scanner;

public class Arr {
    public static void main(String args[]) {
        //1ex
//        Scanner scanner = new Scanner(System.in);
//        int[] arr = new int[10];
//        for (int i = 0; i < 10; i++) {
//            System.out.println("Введите число(0 или 1):");
//            int isElem = scanner.nextInt();
//            arr[i] = isElem;
//        }
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] == 0) {
//                arr[i] = 1;
//            } else {
//                arr[i] = 0;
//            }
//        }
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]);
//        }
        //2ex
//        Scanner scanner = new Scanner(System.in);
//        int[] arr = new int[8];
//        for (int i = 0; i < 8; i++) {
//            System.out.println("Введите число:");
//            int isElem = scanner.nextInt();
//            arr[i] = isElem;
//        }
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]);
//        }
        //3ex
//        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] < 6) {
//                arr[i] *= 2;
//            }
//        }
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]);
//        }
        //4ex
        int counter = 1;
        int[][] table = new int[4][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                table[i][j] = counter;
                System.out.print(table[i][j] + " ");
                counter++;
            }
        }

            }

}
