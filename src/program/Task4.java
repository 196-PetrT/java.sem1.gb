package program;

import java.util.Arrays;
import java.util.List;

public class Task4 {

    public static void main(String[] args) {
        int[] array = {10, 4, 6, 2, 5};

        // ���������� �������
        Arrays.sort(array);
        System.out.println("��������������� ������: " + Arrays.toString(array));
        // Arrays.sort() ��������� ������ �� �����, ������� ������� ���������.

        // ����� � �������
        int index = Arrays.binarySearch(array, 6);
        System.out.println("������ �������� 6: " + index);
        // Arrays.binarySearch() ��������� �������� ����� ���������� �������� � �������.
        // ������ ������ ���� ������������ ����� ������� ����� ������.

        // ��������� ��������
        int[] arrayCopy = {10, 4, 6, 2, 5};
        Arrays.sort(arrayCopy);
        boolean areEqual = Arrays.equals(array, arrayCopy);
        System.out.println("������� �����: " + areEqual);
        // Arrays.equals() ���������� ��� ������� �� ���������.

        // ���������� �������
        int[] newArray = new int[5];
        Arrays.fill(newArray, 7);
        System.out.println("������, ����������� 7: " + Arrays.toString(newArray));
        // Arrays.fill() ��������� ������ �������� ���������.

        // ����������� �������
        int[] arrayCopy2 = Arrays.copyOf(array, array.length);
        System.out.println("����� �������: " + Arrays.toString(arrayCopy2));
        // Arrays.copyOf() ������� ����� ������, ���������� ������ ��������� �������.

        // �������������� ������ � ������
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        Integer[] listArray = list.toArray(new Integer[0]);
        System.out.println("������ ������������ � ������: " + Arrays.toString(listArray));
        // Arrays.asList() ����������� ������ � ������, � list.toArray() ������� � ������.

        // ����������� �������
        int[][] multiArray = {{1, 2, 3}, {4, 5, 6}};
        System.out.println("����������� ������: " + Arrays.deepToString(multiArray));
        // Arrays.deepToString() ������������ ��� ������ ����������� ��������.
    }
}