package program;

public class Task2 {

    public static void main(String[] args) {
        // ������� ������ �������
        System.out.println("����� 10 � 5: " + sum(10, 5));
        System.out.println("�������� 10 � 5: " + subtract(10, 5));
        System.out.println("10 � ������� 3: " + power(10, 3));
        printMultiplicationTable(5);
    }

    // ����� ��� �������� ���� �����
    public static int sum(int a, int b) {
        return a + b;
    }

    // ����� ��� ��������� ���� �����
    public static int subtract(int a, int b) {
        return a - b;
    }

    // ����� ��� ���������� ����� � �������
    public static int power(int base, int exponent) {
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= base;
        }
        return result;
    }

    // ����� ��� ������ ������� ��������� �� ���������� �����
    public static void printMultiplicationTable(int number) {
        System.out.println("������� ��������� ��� ����� " + number + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " * " + i + " = " + (number * i));
        }
    }
}