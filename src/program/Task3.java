package program;

import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {
        int[] array = {10, 20, 5, 30, 15};

        // ����� ������� � ����� �����������
        System.out.println("����������� ��������: " + findMin(array));
        System.out.println("������������ ��������: " + findMax(array));
        printArray(array);
        reverseArray(array);
        System.out.println("������������ ������:");
        printArray(array);

    }

    // ����� ��� ���������� ������������ �������� � �������
    public static int findMin(int[] array) {
        int min = array[0];
        for (int value : array) {
            if (value < min) {
                min = value;
            }
        }
        return min;
    }


    // ����� ��� ���������� ������������� �������� � �������
    public static int findMax(int[] array) {
        int max = array[0];
        for (int value : array) {
            if (value > max) {
                max = value;
            }
        }
        return max;
    }

    // ����� ��� ������ �������
    public static void printArray(int[] array) {
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    // ����� ��� ���������� �������
    public static void reverseArray(int[] array) {
        int temp;
        for (int i = 0; i < array.length / 2; i++) {
            temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;

        }
    }
}