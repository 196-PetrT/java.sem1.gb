package program;

public class Task1 {
    public static void main(String[] args) {
        // int - ������������� ��� ������, ������������ ��� �������� ����� �����
        int a = 10;
        int b = 5;

        // �������������� �������� � �������������� int
        System.out.println("��������: " + (a + b)); // �������� ���� ����� �����
        System.out.println("���������: " + (a - b)); // ��������� ���� ����� �����
        System.out.println("���������: " + (a * b)); // ��������� ���� ����� �����
        System.out.println("�������: " + (a / b)); // ������� ���� ����� �����

        // double - ��� ������ � ��������� ������, ������������ ��� ����� ������ � ������� ����������
        double c = 2.5;
        double d = 1.5;

        // �������������� �������� � �������������� double
        System.out.println("�������� (double): " + (c + d)); // �������� ���� ����� � ��������� ������
        System.out.println("��������� (double): " + (c - d)); // ��������� ���� ����� � ��������� ������

        // ������ ������������� ��������� ��������� if-else
        if (a > b) {
            System.out.println("a ������ b"); // ������� �������, ���� a ������ b
        } else {
            System.out.println("a ������ ��� ����� b"); // �����, ���� a ������ ��� ����� b
        }

        // ������ ����� for
        System.out.println("���� for �� 1 �� 5:");
        for (int i = 1; i <= 5; i++) {
            System.out.println(i); // �������� ����� �� 1 �� 5
        }

        // ������ ����� while
        System.out.println("���� while: ������ �� 5 �� 1");
        int count = 5; // ��������� �������� ��������
        while (count > 0) {
            System.out.println(count); // �������� ������� �������� ��������
            count--; // ��������� �������� �������� �� 1
        }

        // boolean - ���������� ��� ������, ��������� �������� true ��� false
        boolean isEven = a % 2 == 0; // ���������, �������� �� ����� a ������
        System.out.println("����� a ������: " + isEven);

        // char - ��� ������ ��� �������� ���������� �������
        char letter = 'A';
        System.out.println("������: " + letter);
    }
}