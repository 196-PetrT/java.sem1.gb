package program;

import java.util.Arrays;
import java.util.List;

public class Task4 {

    public static void main(String[] args) {
        int[] array = {10, 4, 6, 2, 5};

        // —ортировка массива
        Arrays.sort(array);
        System.out.println("ќтсортированный массив: " + Arrays.toString(array));
        // Arrays.sort() сортирует массив на месте, измен€€ пор€док элементов.

        // ѕоиск в массиве
        int index = Arrays.binarySearch(array, 6);
        System.out.println("»ндекс элемента 6: " + index);
        // Arrays.binarySearch() выполн€ет двоичный поиск указанного значени€ в массиве.
        // ћассив должен быть отсортирован перед вызовом этого метода.

        // —равнение массивов
        int[] arrayCopy = {10, 4, 6, 2, 5};
        Arrays.sort(arrayCopy);
        boolean areEqual = Arrays.equals(array, arrayCopy);
        System.out.println("ћассивы равны: " + areEqual);
        // Arrays.equals() сравнивает два массива на равенство.

        // «аполнение массива
        int[] newArray = new int[5];
        Arrays.fill(newArray, 7);
        System.out.println("ћассив, заполненный 7: " + Arrays.toString(newArray));
        // Arrays.fill() заполн€ет массив заданным значением.

        //  опирование массива
        int[] arrayCopy2 = Arrays.copyOf(array, array.length);
        System.out.println(" опи€ массива: " + Arrays.toString(arrayCopy2));
        // Arrays.copyOf() создает новый массив, €вл€ющийс€ копией исходного массива.

        // ѕреобразование списка в массив
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        Integer[] listArray = list.toArray(new Integer[0]);
        System.out.println("—писок преобразован в массив: " + Arrays.toString(listArray));
        // Arrays.asList() преобразует массив в список, а list.toArray() обратно в массив.

        // ћногомерные массивы
        int[][] multiArray = {{1, 2, 3}, {4, 5, 6}};
        System.out.println("ћногомерный массив: " + Arrays.deepToString(multiArray));
        // Arrays.deepToString() используетс€ дл€ печати многомерных массивов.
    }
}