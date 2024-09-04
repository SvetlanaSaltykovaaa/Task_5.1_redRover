import java.util.Arrays;

public class Main {
    static int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
    static int[][] deepArray = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};

    //Задача №1. Вывести сумму всех значений массива.
    static int toPrintSum(int[] array) {
        int sum = 0;
        for (int number : array) {
            sum += number;
        }
        return sum;
    }

    //Задача №2. Вывести максимальное значение массива.
    static int toPrintMax(int[] array) {
        Arrays.sort(array);
        return array[array.length - 1];
    }

    //Задача №3. Вывести минимальное значение массива.
    static int toPrintMin(int[] array) {
        Arrays.sort(array);
        return array[0];
    }

    //Задача №4. Вывести среднее арифметическое всех значений массива.
    static int toPrintArithmeticMean() {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        return toPrintSum(array) / array.length;
    }

    //Задача №5.  Вывести сумму элементов массива
    static int toPrintSumOfElements(int[][] array) {
        int sum = 0;
        for (int[] part : array) {
            for (int elementOfArray : part) {
                sum += elementOfArray;
            }
        }
        return sum;
    }

    //Задача №6.Вывести максимальное значение массива
    static int toPrintMaxForDeepArray(int[][] deepArray) {
        int maxNumber = 0;
        for (int i = 0; i < deepArray.length; i++) {
            for (int j = 0; j < deepArray[i].length; j++) {
                if (deepArray[i][j] > maxNumber) {
                    maxNumber = deepArray[i][j];
                }
            }
        }
        return maxNumber;
    }

    //Задача №7. Вывести количество элементов в массиве
    static int toPrintCountOfElements(int[][] deepArray) {
        int sumOfElements = 0;
        for (int[] part : deepArray) {
            sumOfElements += part.length;
        }
        return sumOfElements;
    }

    public static void main(String[] args) {
        System.out.println(toPrintSum(array));
        System.out.println(toPrintMax(array));
        System.out.println(toPrintMin(array));
        System.out.println(toPrintArithmeticMean());
        System.out.println(toPrintSumOfElements(deepArray));
        System.out.println(toPrintMaxForDeepArray(deepArray));
        System.out.println(toPrintCountOfElements(deepArray));
    }
}